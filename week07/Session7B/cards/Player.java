package week07.Session7B.cards;

public enum Player {
    MAGE("Mage", 250),
    WARRIOR("Warrior", 190),
    BARBARIAN("Barabarian", 300),
    THEIF("Theif", 50);

    private String title;
    private int powerLevel;

    private Player(String title, int powerLevel){
        this.title = title;
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel(){
        return powerLevel;
    }

    @Override
    public String toString() {
        return title;
    }
}
