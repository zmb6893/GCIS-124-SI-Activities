package solutions.week03.Session3B;

/**
 * Session 3B: Basic inheritance.
 * @author Zoe Bingham
 */

public class Attack {
    protected final String name;
    protected final int damage;

    public Attack(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return this.name + " deals " + this.damage;
    }

    public int attack(BattleGround battleGround){
        return 0;
    }
}
