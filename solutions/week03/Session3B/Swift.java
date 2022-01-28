package solutions.week03.Session3B;

import java.util.Random;

public class Swift extends Attack{
    private Random rand = new Random();
    private final int[] CRIT = new int[]{1,1,1,1,1,2,2,3};

    public Swift(String name, int damage) {
        super(name, damage);
    }
    
    public int attack(BattleGround battleGround){
        int multiplier = CRIT[rand.nextInt(CRIT.length)];
        System.out.println(this + " x " + multiplier);
        return damage * multiplier;
    }
}
