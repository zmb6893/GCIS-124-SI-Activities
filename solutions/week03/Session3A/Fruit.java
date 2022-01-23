package solutions.week03.Session3A;
/**
 * Enumeration example for reference.
 * @author Zoe Bingham
 */
public enum Fruit {
    APPLE("apple",1.50),
    PEAR("pear",1.50),
    BANANA("banana", 0.20);

    private String name;
    private double price;

    private Fruit(String name, double price){
        this.name = name;
        this.price = price;
    }
}