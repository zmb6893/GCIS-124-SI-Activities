package week04.Session4B;

/**
 * Session4B: Interfaces, Abstract Classes, and GUI.
 * @author Zoe Bingham
 */

public abstract class Player {
    protected String name;
    private String type;

    public Player(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void jump(){
        System.out.println(this.name + " jumped!"); 
    }

    // TODO: What if we want a non-generic method for a special attack?
}
