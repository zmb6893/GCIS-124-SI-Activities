package solutions.week02.Session2A;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Session 2A: JUnit Testing and Files & Exceptions
 * @author: Zoe Bingham
 */
public class Session2A {
    public static void main(String[] args) {
        // Call the readFile function on the sample.txt and store the result in an array of size 6
        String[] lines = new String[6];
        lines = readFile("sample.txt");

        // Call the respondToPrompt function with the array from the previous instruction.
        respondToPrompt(lines);
    }

    /**
     * Make a function called readFile that reads the contents of a file and returns an array of strings. Each string in the array represents a line.
     * @param filename
     * @return
     */
    public static String[] readFile(String filename) {
        // Creates an array with a size of 6
        String lines[] = new String[6];

        // Prepares a file to be read character by character
        try(FileReader fr = new FileReader(filename);
                // Prepares the file reader to be read as lines instead of individual characters
                BufferedReader reader = new BufferedReader(fr)) {
                
                // Read lines one by one
                int count = 0;
                String line = reader.readLine();
                while(line != null) {   
                    // Assign the contents of the files to the array      
                    lines[count] = line;
                    count++;

                    // Get the next line ready for the next iteration of the loop
                    line = reader.readLine();
                }
            } catch(IOException ioe) {
                // Catch an error so the program doesn't crash
                System.out.println(filename + " does not exist.");
            }
        return lines;
    }

    /**
     * Create a function called respondToPrompt that receives user input to respond to the prompts in the passed in array
     * @param lines
     */
    public static void respondToPrompt(String[] lines){
        // Holds the user input value from each interaction
        String placeHolder = "";
        // Creates a new scanner with standard system input
        Scanner scanner = new Scanner(System.in);

        // Goes over every line in the lines array
        for (String string : lines) {
            // Formats the string to use placeHolder
            System.out.println(String.format(string, placeHolder));
            placeHolder = scanner.nextLine();
        }

        // Don't forget to close the scanner
        scanner.close();
    }
}