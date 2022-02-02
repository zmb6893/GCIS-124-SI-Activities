package solutions.week04.Session4A;

public class Snake extends Animal{

    private String scaleColor;

    public Snake(String name, String description, String scaleColor) {
        super(name, description);
        this.scaleColor = scaleColor;
        this.addToDescription(this.name + " is a snake");
        this.addToDescription(this.name + " has a " + this.scaleColor + " scale color.");
    }

    @Override
    public String move() {
        System.err.println(this.name + " slithers");
        return this.name + " slithers";
    }

    @Override
    public String makeSound() {
        System.out.println("HISS");
        return "HISS";
    }

    public String shed(){
        System.out.println(this.name + " has shed its skin");
        return this.name + " has shed its skin";
    }
    
}
