package week02.Session2B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Session 2B: Introduction to java classes.
 * @author: Zoe Bingham
 */

public class Hobby {
    // CONSTANTS
    private String FORMAT =  "%s:\t %s"; // Can use String.format(FORMAT, arg1, arg2) EXAMPLE: String.format(FORMAT, "sleeping", "the best hobby") -> "sleeping:    the best hobby"

    // Add the attributes for a hobby name and a hobby description

    /**
     * Make a hobby with the given description and name.
     * @param name
     * @param description
     */
    

    // Add the appropriate getters and setters
    

    // Add the appropriate action methods to this class.
    /**
     * Print out the name of the hobby followed by the description of the hobby.
     */
    

    // BONUS ACTIVITY
    /**
     * Make a method that returns an array of hobbies from a given file. First line 
     * is a hobby and the next line is the description
     * @param filename
     * @return
     */
    public static Hobby[] readFileForHobbies(String filename){
        Hobby[] hobbies = new Hobby[4];

        return hobbies;
    }

    public static void main(String[] args){
        // Make an instance of a hobby

        // Call the doHobby with the hobby that has just been created

    }
}
