package solutions.week03.Session3A;

/**
 * Session 3A: Special methods and enumerations. Refactor these 
 * classes to use enumerations and special methods
 * @author: Zoe Bingham
 */

public class Person {
    // CONSTANTS
    private static String FORMAT = "%s (%d)";

    // STATIC VARIABLES
    private static int personHash = 0;

    // Add the attributes name, age, hobbies
    private String name;
    private int age;
    private Hobby[] hobbies = new Hobby[16];

    /**
     * Make a constructor for the person class that takes arguments for a name and age
     * @param name
     * @param age
     */
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        personHash++;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Hobby[] getHobbies(){
        return hobbies;
    }

    // Setters
    // (Names should not be alterable and age should not decrease)
    /**
     * Increment the age by one year,
     */
    public void incrementAge(){
        this.age++;
    }

    /**
     * Change the name to the specified name
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Add the provided hobby to the person's list of hobbies.
     * @param hobby
     */
    public void addHobby(Hobby hobby){
        this.hobbies[this.hobbies.length-1] = hobby;
    }

    // SPECIAL METHODS
    @Override
    public String toString() {
        return String.format(FORMAT, this.name, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        // if obj is instance of person and has the same name and age, return true
        if (obj instanceof Person){
            Person other = (Person)obj;
            return (other.getName() == this.getName()); 
        }

        // otherwise return false
        return false;
    }

    @Override
    public int hashCode() {
        return personHash;
    }

    public static void main(String[] args){
        // Make an instance of a Person class with your name.
        String name = "Zoe";
        int age = 20;
        Person zoe = new Person(name,age);

        // Add hobbies to the person object you created
        zoe.addHobby(Hobby.GARDENING);
        zoe.addHobby(Hobby.ALCHEMY);
        zoe.addHobby(Hobby.SWIMMING);

        // Print out the person with their hashcode.
        System.out.println(zoe + " hashcode: " + zoe.hashCode());
        Person other = new Person("other",42);
        System.out.println(other + " hashcode: " + other.hashCode());
    }
}
