package week03.Session3A;

/**
 * Session 3A: Special methods and enumerations. Refactor these 
 * classes to use enumerations and special methods
 * @author: Zoe Bingham
 */

public class Person {
    // TODO: Add a constant for formating a person string to look
    // like: name (age)

    // TODO: Add a variable that will keep track of how many times the constructor is called.

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

    // TODO: Add special methods that we learned from class. (equals and hashCode)

    public static void main(String[] args){
        // Make an instance of a Person class with your name.
        String name = "Zoe";
        int age = 20;
        Person zoe = new Person(name,age);

        // Make a few instances of hobbies and add those to the list of hobbies
        String hName0 = "Swimming";
        String hDesc0 = "Flopping around in the water.";
        String hName1 = "Running";
        String hDesc1 = "Flopping around on land.";
        String hName2 = "Hiking";
        String hDesc2 = "Flopping around on a mountain.";

        Hobby swimming = new Hobby(hName0, hDesc0);
        Hobby running = new Hobby(hName1, hDesc1);
        Hobby hiking = new Hobby(hName2, hDesc2);

        zoe.addHobby(swimming);
        zoe.addHobby(running);
        zoe.addHobby(hiking);

        // Do all the hobbies that that person has using the method you made
        Hobby[] hobbies = zoe.getHobbies();
        for(int i = 0; i <= hobbies.length; i++){
            hobbies[i].doHobby();
        }
        /**
        // OTHER OPTION
        for (Hobby hobby : hobbies){
            hobby.doHobby();
        }

        // OTHER OPTION
        int i = 0;
        while (i < hobbies.length){
            hobbies[i].doHobby();
        } */
    }
}
