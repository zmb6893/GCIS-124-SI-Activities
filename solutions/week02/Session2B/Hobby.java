package solutions.week02.Session2B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Session 2B: Introduction to java classes.
 * @author: Zoe Bingham
 */

public class Hobby {
    // CONSTANTS
    private String FORMAT =  "%s:\t %s";

    // Add the attributes for a hobby name and a hobby description
    private String name;
    private String description;

    /**
     * Make a hobby with the given description and name.
     * @param name
     * @param description
     */
    public Hobby(String name, String description){
        this.name = name;
        this.description = description;
    }

    // Add the appropriate getters and setters
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public void changeDescription(String description){
        this.description = description;
    }

    // Add the appropriate action methods to this class.
    /**
     * Print out the name of the hobby followed by the description of the hobby.
     */
    public void doHobby(){
        System.out.println(String.format(FORMAT, this.name, this.description));
    }

    // BONUS ACTIVITY
    /**
     * Make a method that returns an array of hobbies from a given file. First line 
     * is a hobby and the next line is the description
     * @param filename
     * @return
     */
    public static Hobby[] readFileForHobbies(String filename){
        Hobby[] hobbies = new Hobby[4];
        // Open the file
        try(FileReader fr = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fr)) {
            int count = 1;
            int hCount = 0;
            String arg1 = "";
            String arg2 = "";
            String line = reader.readLine();
            
            // Loop until end of file
            while (line != null){
                if (count % 2 == 0){
                    // Keep track of the second argument
                    arg2 = line;
                    hobbies[hCount] = new Hobby(arg1, arg2);
                    hCount++;   // index of the hobby array increments
                } else {
                    // Keep track of the 1st argument
                    arg1 = line;
                }
                count++;
                line = reader.readLine();
            }
        } catch (IOException e){
            System.err.println("An IOException has occured");
        }

        return hobbies;
    }

    public static void main(String[] args){
        // Make an instance of a hobby
        Hobby sleeping = new Hobby("sleeping", "the best hobby");

        // Call the doHobby with the hobby that has just been created
        sleeping.doHobby();
        for (Hobby hobby : Hobby.readFileForHobbies("solutions/week02/Session2B/Hobbies.txt")){
            hobby.doHobby();
        }
    }
}
