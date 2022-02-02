package solutions.week04.Session4A;

public class Main {
    public static void main(String[] args) {
        // An array of animals
        Animal[] animals = new Animal[]{
            new Cat("Marbles", "A spotty little guy", "calico"),
            new Dog("Buster", "Wears a natural tuxedo", "black and white"), 
            new Snake("Alfred", "Doesn't like anyone", "red"),
            new Cat("Achilles", "A pretentious fella.", "grey and white"),
            new Cat("Machone", "Doesn't like catnip", "grey"),
            new Fish("Bubbles", "A gentleman.")
        };

        // Will this work?
        for (Animal animal : animals){
            animal.describe();
            animal.move();
            animal.makeSound();
            System.out.println();
        }

    }
}
