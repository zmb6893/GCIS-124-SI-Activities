package week03.Session3A;

/**
 * Session 3A: Special methods and enumerations. Refactor these
 * classes to use special methods and enumerations
 * @author: Zoe Bingham
 */

 // TODO: if we only want certain hobbies, what should we do to
 // TODO: the hobby class?
public class Hobby {
    // CONSTANTS
    private static String FORMAT =  "%s:\t %s";

    // Add the attributes for a hobby name and a hobby description
    private String name;
    private String description;


    // TODO: Make a new constructor that only takes in an argument
    // for name and defaults the description to "add a description"
    
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

    /**
     * Change the current description of hobby to the passed in 
     * description
     * @param description
     */
    public void changeDescription(String description){
        this.description = description;
    }

    // TODO: Change this function to a toString function.
    /**
     * Print out the name of the hobby followed by the description of the hobby.
     */
    public void doHobby(){
        System.out.println(String.format(FORMAT, this.name, this.description));
    }

    // TODO: Can you add any other special methods?

    public static void main(String[] args){
    // TODO: Print a hobby before and after adding a description

    }
}
