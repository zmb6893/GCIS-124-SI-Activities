package Practicum_Review.Final.HangMan;

import java.util.Scanner;

/**
 * A player that can play a game of hangman through a proxy.
 * @author: Zoe Bingham
 */

public class Player {

    private HangmanInterface game;

    public Player(HangmanInterface game){
        this.game = game;
    }

    private void guess(String[] tokens){

        char c = tokens[1].charAt(0);
        game.guess(c);
        
    }

    private boolean quit(Scanner scanner) {
        System.out.print("Are you sure (Y/N)? ");
        String response = scanner.nextLine();
        boolean shouldQuit = response.equalsIgnoreCase("y");
        if(shouldQuit) {
            game.quit();
        }
        return shouldQuit;
    }

    public void playHangman(){
        Scanner scanner = new Scanner(System.in);

        boolean sentinel = true;
        while(sentinel) {
            String commandLine = scanner.nextLine();
            String[] tokens = commandLine.split(" ");

            if(tokens.length == 0) {
                System.err.println("You must enter a command.");
                continue;
            }

            System.out.println(game);

            switch(tokens[0].toLowerCase()) {
                case "guess":
                    guess(tokens);
                    break;
                case "quit":
                    sentinel = !quit(scanner);
                    break;
                default:
                    System.err.println("Unrecognized command.");
                    break;
            }
        }

        scanner.close();
    }
}
