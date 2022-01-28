package solutions.week03.Session3B;

/**
 * Test the attacks in different battle scenarios.
 * @author Zoe Bingham
 */

public class Main {
    private static final int DEFAULT_DAMAGE = 100;
    public static void main(String[] args) {
        // Make the attacks
        Aerial airDive = new Aerial("Air Dive", DEFAULT_DAMAGE);
        Earth rumble = new Earth("Rumble", DEFAULT_DAMAGE);
        Swift quickStrike = new Swift("Quick Strike", DEFAULT_DAMAGE);

        // Test attacks in different battle spaces
        BattleGround[] battleGrounds = new BattleGround[5];
        battleGrounds[0] = BattleGround.AIR; battleGrounds[1] = BattleGround.DESERT; battleGrounds[2] = BattleGround.GRASSLAND; battleGrounds[3] = BattleGround.MARSH; battleGrounds[4] = BattleGround.MOUNTAIN; 

        for(BattleGround battleGround: battleGrounds){
            System.out.println(battleGround);
            int a1 = airDive.attack(battleGround);
            System.out.println(a1);
            int a2 = rumble.attack(battleGround);
            System.out.println(a2);
            int a3 = quickStrike.attack(battleGround);
            System.out.println(a3);
            System.out.println("\n");
        }
        

    }
}
