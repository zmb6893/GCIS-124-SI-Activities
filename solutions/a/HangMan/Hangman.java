package Practicum_Review.Final.HangMan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * Game of hangman.
 * @author Zoe Bingham
 */

public class Hangman implements HangmanInterface {

    private String word;
    private char[] currentGuess;
    private HashSet<Character> incorrectGuess;
    private int guesses;
    private String[] words;
    private Random random = new Random();

    /**
     * Specify a word to use in the hangman.
     * @param word
     */
    public Hangman(String word){
        this.word = word.toUpperCase();
        this.incorrectGuess = new HashSet<Character>();
        this.currentGuess = new char[word.length()];
        Arrays.fill(this.currentGuess, '_');
        this.guesses = 0;
    }

    /**
     * Use a random phrase for a game of hangman
     * @param word
     */
    public Hangman(){
        this.words = new String[]{"OSI-is-a-seven-layer-protocol","DOD-is-a-four-layer-protocol","Proxy-is-kinda-sus","TCP-stands-for-transport-control-protocol","UDP-stands-for-User-Datagram-Packet","Full-Duplex-goes-both-ways-at-the-same-time","Simplex-goes-one-way-at-a-time","Half-duplex-goes-both-ways-one-at-a-time"};
        String str = words[random.nextInt(words.length)];
        this.word = str.toUpperCase();
        this.incorrectGuess = new HashSet<Character>();
        this.currentGuess = new char[word.length()];
        Arrays.fill(this.currentGuess, '_');
        this.guesses = 0;
    }

    /**
     * Attempt to make a guess with a given character
     * @param c
     * @return
     */
    @Override
    public String guess(char c){
        char C = Character.toUpperCase(c);

        // Check if the guess can be made
        if (incorrectGuess.contains(C) && !hasWon()){
            return "You have already guessed \u001B[31m" + C + "\u001B[0m";
        } else if (this.canGuess()){
            return this.checkValid(C);
        }

        return "Something went wrong during a guess...";
    }

    /**
     * Checks if a guess can be made
     * @return
     */
    public boolean canGuess(){
        return guesses < 7 && !hasWon();
    }

    /**
     * Checks if a game has been lost
     */
    public boolean hasLost(){
        return guesses > 6;
    }

    /**
     * Checks if the game has been won.
     * @return
     */
    public boolean hasWon(){
        for (char c : currentGuess){
            if (c == '_'){
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the character is a part of the word. If the character is a part
     * of the word, add the character to the current guess. If the character is
     * not a part of the word, add the character to the incorrect guesses and add
     * to the guesses count.
     * @return
     */
    private String checkValid(char c){
        String message = "Something went wrong in while checking if the character was valid";

        boolean hasC = false;
        for (int i = 0; i < word.length(); i++){
            // If the character is in the word, add the character to the current Guess
            if (word.charAt(i) == (c)){
                message = "Adding \u001B[32m" + c + "\u001B[0m to the current guess...";
                currentGuess[i] = c;
                hasC = true;
            }
        }

        if (!hasC){
            // If the character is not in the word, increment the guesses count and add the guess to the incorrectGuesses
            message = "You've made an incorrect guess. Adding \u001B[31m" + c + "\u001B[0m to the incorrect guesses...";
            this.guesses++;
            this.incorrectGuess.add(c);
        }

        if (hasWon()){
            return "\u001B[32mYou won!\u001B[0m";
        }

        if (hasLost()){
            return "\u001B[31mLooser... You are such a disappointment :(\u001B[0m";
        }

        // Display the guess
        System.out.println(this.toString());

        return message;
    }

    public void play(){
        System.out.println(this.toString());

        Scanner scanner = new Scanner(System.in);

        while(this.canGuess()){
            System.out.println("Make a guess: ");
            char guess = scanner.next().toCharArray()[0];
            System.out.println(this.guess(guess));
        }

        scanner.close();
    }

    /**
     * Print out the current game of hangman.
     */
    @Override
    public String toString() {
        String tBar   =   "\t+---+\n\t|   |";
        String head   =   "\n\t|";
        String torso  =   "\n\t|";
        String legs   =   "\n\t|";
        String btmBar =   "\n\t|\n\t+-----";

        String hangman = tBar+head+torso+legs+btmBar;

        // Create the hangman
        switch(guesses){
            case 0:
                hangman = tBar+head+torso+legs+btmBar;
                break;
            case 1:
                hangman = tBar+head+"   o"+torso+legs+btmBar;
                break;
            case 2:
                hangman = tBar+head+"   o"+torso+"   |"+legs+btmBar;
                break;
            case 3:
                hangman = tBar+head+"   o"+torso+"  /|"+legs+btmBar;
                break;
            case 4:
                hangman = tBar+head+"   o"+torso+"  /|\\"+legs+btmBar;
                break;
            case 5:
                hangman = tBar+head+"   o"+torso+"  /|\\"+legs+"  /"+btmBar;
                break;
            case 6:
                hangman = tBar+head+"   o"+torso+"  /|\\"+legs+"  / \\"+btmBar;
                break;
            case 7:
                hangman = tBar+head+"   o"+torso+"  /|\\"+legs+"  / \\"+btmBar;
                break;
            default:
                hangman = tBar+head+torso+legs+btmBar;
                break;
        }
        
        // Display the guesses
        String lGuesses = "";
        for (char guess : incorrectGuess){
            lGuesses = lGuesses + Character.toString(guess) + " " ;
        }

        // Display the word completion
        String wordCompletion = "";
        for (char ch : currentGuess){
            wordCompletion = wordCompletion + Character.toString(ch) + " ";
        }

        String gameString = hangman + "\n\nIncorrect Guesses: 	\u001B[31m"  + lGuesses + "\u001B[0m\n\n\t" + wordCompletion;

        return gameString;
    }

    @Override
    public void quit() {
        // Quit doesn't need to do anything here        
    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.play();
    }

    
}
