package solutions.Review01.Solutions.FilesPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StoryTeller {

    /**
     * Prompt the user what they thought about the story and then print out 
     * "You thought: [thoughts]"
     */
    public static void rateStory(){
        System.out.println("What do you think?");
        Scanner scanner = new Scanner(System.in);
        String thoughts = scanner.nextLine();
        System.out.println("You thought: " + thoughts);
        scanner.close();
    }

    /**
     * Read the file character by character
     * @param filename
     */
    public static void charByChar(String filename){
        try(FileReader fr = new FileReader(filename);){
            int character = fr.read();
            while (character != -1){
                System.out.println((char)character);
                character = fr.read();
            }
        } catch (IOException e) {
            System.err.println("IOException in charByChar");
        }
    }

    /**
     * Tells the story contained in the specified file.
     * @param filename
     */
    public static void tellStory(String filename){
        try(FileReader fr = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fr)) {
            // Loop until end of file
            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e){
            System.err.println("An IOException in tellStory");
        }
    }

    public static void wordByWord(String filename){
        try(FileReader fr = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fr)){
            String line = reader.readLine();
            while (line != null){
                String[] words = line.split(" ");
                for (String word : words){
                    System.out.println(word);
                }
                line = reader.readLine();
            }
        } catch (IOException e){
            System.err.println("An IOException in wordByWord");
        }
    }

    public static void main(String[] args) {
        String filename = "Practicum_Review/Reveiw01/FilesPractice/episode-1-The-Goats-And-The-Troll.txt";
        tellStory(filename);
        charByChar(filename);
        wordByWord(filename);
        rateStory();
    }
}
