package solutions.week04.Session4A;

public class Cat extends Animal {

    private String furColor;

    public Cat(String name, String description, String furColor) {
        super(name, description);
        this.furColor = furColor;
        this.addToDescription(this.name + " is a cat");
        this.addToDescription(this.name + " has a " + this.furColor + " fur color.");
    }

    @Override
    public String move() {
        System.out.println(this.name + " pounces"); 
        return this.name + " pounces";
    }

    @Override
    public String makeSound() {
        System.out.println("MEOW");
        return "MEOW";
    }

    public String purr(){
        System.out.println("PURR");
        return "PURR";
    }
    
}
