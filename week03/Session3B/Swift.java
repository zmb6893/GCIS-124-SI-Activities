package week03.Session3B;

import java.util.Random;

/**
 * Session 3B: Basic inheritance.
 * @author Zoe Bingham
 */

public class Swift {

    protected final String name;
    protected final int damage;
    private final int[] CRIT = new int[]{1,1,1,1,1,2,2,3};

    public Swift(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return this.name + " deals " + this.damage;
    }
    
    public int attack(BattleGround battleGround){
        int multiplier = CRIT[/**Use random to get an index for crit*/];
        System.out.println(this + " x " + multiplier);
        return damage * multiplier;
    }
}
