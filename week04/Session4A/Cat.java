package week04.Session4A;

/**
 * Session 4A: Abstract classes
 * @author: Zoe Bingham
 */

// TODO: How will we use our Animal class?
public class Cat{

    private String furColor;

    public Cat(String name, String description, String furColor) {
        // TODO: what do we do in the constructor?
        this.addToDescription(this.name + " is a cat");
        this.addToDescription(this.name + " has a " + this.furColor + " fur color.");
    }

    // TODO: implement move and makeSound

    // TODO: implement a purr method
    
}
