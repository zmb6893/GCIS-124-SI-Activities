package solutions.week04.Session4A;

/**
 * Session 4A: Abstract classes
 * @author: Zoe Bingham
 */

public abstract class Animal {
    protected final String name;
    protected String description;

    public Animal(String name, String description){
        this.name = name;
        this.description = description;
    }

    /**
     * An animal should be able to move in some way. (Example: "A fish swims" or "A snake slithers")
     * @return A short description of the movement
     */
    public abstract String move();
    /**
     * An animal should be able to make some sound. (Example: "BUBBLE BUBBLE" or "HISS")
     * @return A sound of an animal
     */
    public abstract String makeSound();

    /**
     * Describes the animal.
     * @return the name and description of the animal.
     */
    public String describe(){
        System.out.println(name + ": " + description);
        return name + ": " + description;
    }

    /**
     * Append the addition to the end of the description string.
     * @param addition
     */
    protected void addToDescription(String addition){
        this.description = description + ". " + addition;
    }
}
