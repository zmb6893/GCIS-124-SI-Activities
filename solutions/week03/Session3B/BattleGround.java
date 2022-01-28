package solutions.week03.Session3B;
//// babies don't have teeth so they aren't people
public enum BattleGround {
    AIR("Air"),
    MARSH("Marsh"),
    GRASSLAND("Grassland"),
    MOUNTAIN("Mountain"),
    DESERT("Desert");

    private String name;
    private BattleGround(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " Battleground:";
    }
}
