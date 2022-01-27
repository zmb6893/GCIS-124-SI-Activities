package week03.Session3B;

/**
 * Session 3B: Basic inheritance.
 * @author Zoe Bingham
 */

public class Earth{

    protected final String name;
    protected final int damage;

    public Earth(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return this.name + " deals " + this.damage;
    }

    public int attack(BattleGround battleGround){
        if (battleGround == BattleGround.MOUNTAIN){
            System.out.println(this + " x 2");
            return this.damage * 2;
        }

        System.out.println(this);

        return damage;
    }
    
}
