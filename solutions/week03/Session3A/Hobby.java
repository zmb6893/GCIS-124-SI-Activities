package solutions.week03.Session3A;

/**
 * Session 3A: Special methods and enumerations. Refactor these
 * classes to use special methods and enumerations
 * @author: Zoe Bingham
 */

// What do we do in order to make Hobby into an enumeration?
public enum Hobby {
    SWIMMING("Swimming"),
    RUNNING("Running"),
    GARDENING("Gardening"),
    ALCHEMY("Alchemy"),
    EXCERCIZE("Excersizing",
    "A treachorous activity only for those with damaged souls. Why would you do that to yourself?");

    // CONSTANTS
    private static String FORMAT =  "%s:\t %s";

    // Add the attributes for a hobby name and a hobby description
    private String name;
    private String description;

    /**
     * Make a hobby with the given description and name.
     * @param name
     * @param description
     */
    private Hobby(String name, String description){
        this.name = name;
        this.description = description;
    }

    /**
     * Make a hobby with the given name and no description.
     * @param name
     * @param description
     */
    private Hobby(String name){
        this.name = name;
        this.description = "add a description";  // no description of hobby has been set
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

    // SPECIAL METHODS
    @Override
    public String toString(){
        return String.format(FORMAT, this.name, this.description);
    }

    public static void main(String[] args){
        // Print a hobby before and after adding a description
        System.out.println(SWIMMING);
        SWIMMING.changeDescription("flopping around in the water");
        System.out.println(SWIMMING.toString());
    }
}
