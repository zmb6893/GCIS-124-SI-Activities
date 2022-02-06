package Practicum_Review.Reveiw01.FilesPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StoryTeller {
    /**
     * Read the file character by character
     * @param filename
     */
    public static void charByChar(String filename){
        // TODO: Add your implementation here.
    }

    /**
     * Tells the story contained in the specified file by printing line by line.
     * @param filename
     */
    public static void tellStory(String filename){
        // TODO: Add your implementation here.
    }

    public static void wordByWord(String filename){
        // TODO: Add your implementation here.
    }

    public static void main(String[] args) {
        String filename = "Practicum_Review/Reveiw01/FilesPractice/episode-1-The-Goats-And-The-Troll.txt";
        tellStory(filename);
        charByChar(filename);
        wordByWord(filename);
    }
}
