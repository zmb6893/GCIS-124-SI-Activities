package solutions.week04.Session4A;

public class Dog extends Animal {

    private String furColor;

    public Dog(String name, String description, String furColor) {
        super(name, description);
        this.furColor = furColor;
        this.addToDescription(this.name + " is a dog");
        this.addToDescription(this.name + " has a " + this.furColor + " fur color.");
    }

    @Override
    public String move() {
        System.out.println(this.name + " trots");
        return this.name + " trots";
    }

    @Override
    public String makeSound() {
        System.out.println("WOOF");
        return "WOOF";
    }
    
}
