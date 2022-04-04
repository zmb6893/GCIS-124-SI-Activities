package solutions.Review03.Lambda;

/**
 * Follow the instructuctions in the comments.
 * 
 * @author Zoe Bingham
 */

public class Practice {
    // TODO: Make an inner class (interface) for a food that holds the functionality for consuming which will return a string on how it is consumed 
    interface Food {
        String consume();
    }

    public static String foodFight(Food food){
        return "Throwing a food with the following instructions: " + food.consume();
    }

    public static void main(String[] args) {
        // TODO: Use an anonymous class to make an apple with a string with instructions to consume an apple. EX: "Pick up an apple and bite into it.""
        Food apple = new Food(){
            @Override
            public String consume() {
                return "Pick up an apple and bite into it.";
            }
        };

        Food cinnamon_roll = new Food() {
            @Override
            public String consume() {
                return "Bought a cinnamon roll and ate it.";
            }
        };

        Food pear = () -> "I bought a pear and ate it.";




        // Due to the consume() method from the inner class interface has no paramaters/arguments, the "()" in the lambda line code is empty/has nothing then there will be an "->" the "{}" where the "{}" will return something
        Food orange = () -> {System.out.println("orange"); return "I at an orange.";};
        System.out.println(orange.consume());

        System.out.println(cinnamon_roll.consume());

        // TODO: Print out the results of apple.consume
        System.out.println(apple.consume());

        // TODO: Use a lambda to make a banana
        Food banana = () -> "Peel a banana and eat it.";
        System.out.println(banana.consume());

        // TODO: Print out the output for throwing a food with some consumption instructions. 
        System.out.println(foodFight(()->"Open chip bag and consume"));
    } 
}
