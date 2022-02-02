package solutions.week04.Session4A;

public class Fish extends Animal {

    public Fish(String name, String description) {
        super(name, description);
    }

    @Override
    public String move() {
        System.out.println(name + " swims a lap in its bowl.");
        return name + " swims a lap in its bowl.";
    }

    @Override
    public String makeSound() {
        System.out.println("BLIB BLUB BLUB");
        return "BLIB BLUB BLUB";
    }
    
}
