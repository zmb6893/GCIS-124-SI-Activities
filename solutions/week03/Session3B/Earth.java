package solutions.week03.Session3B;

public class Earth extends Attack{

    public Earth(String name, int damage) {
        super(name, damage);
    }

    @Override
    public int attack(BattleGround battleGround){
        if (battleGround == BattleGround.MOUNTAIN){
            System.out.println(this + " x 3");
            return this.damage * 3;
        }

        System.out.println(this);

        return damage;
    }
    
}
