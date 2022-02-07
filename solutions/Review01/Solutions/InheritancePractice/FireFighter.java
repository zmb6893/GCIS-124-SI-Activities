package solutions.Review01.Solutions.InheritancePractice;

/**
 * Session4B: Interfaces, Abstract Classes, and GUI.
 * @author Zoe Bingham
 */

public class FireFighter extends Player implements WaterSplasher{

    private String slogan;

    public FireFighter(String name, String type, String slogan) {
        super(name, type);
        this.slogan = slogan;
    }

    @Override
    public void splash() {
        System.out.println(this.name + " splashed water at a fire with a hose.");
    }

    @Override
    public void specialAttack() {
        System.out.println(this.name + " dealt 50 points of " + this.getType() + " damage!");      
        System.out.println(this.slogan);  
    }
    
}
