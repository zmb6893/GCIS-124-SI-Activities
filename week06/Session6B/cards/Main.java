package week06.Session6B.cards;

/**
 * Session 6B: Iterators and Generics- main file.
 * @author Zoe Bingham
 */

 //TODO: Run this once you come up with a solution
public class Main {
    public static void main(String[] args) {
        // These will be our decks
        char[] chars = new char[]{'A','B','C','D'};
        String[] ranks = new String[]{"King", "Queen", "Jack"};
        Integer[] numbers = new Integer[]{3,1,66,13,2,94};

        // Make a character deck.
        System.out.println("Character Deck: ");
        Deck<Character> charsDeck = new Deck<>(new Card<Character>('E'));
        for (char c : chars){
            charsDeck.addCard(new Card<Character>(c));
        }
        // Use the for each loop to print out the characters in a deck.
        for (Card<Character> card : charsDeck){
            System.out.println(card);
        }
        System.out.println();



        // Make a rank deck
        System.out.println("Rank Deck: ");
        Deck<String> ranksDeck = new Deck<>(new Card<String>("Ace"));
        for (String rank : ranks){
            ranksDeck.addCard(new Card<String>(rank));
        }
        // Use the for each loop to print out the ranks in a deck.
        for (Card<String> card : ranksDeck){
            System.out.println(card);
        }
        System.out.println();



        // Make an Integer deck
        System.out.println("Integer Deck: ");
        Deck<Integer> numDeck = new Deck<>(new Card<Integer>(14));
        for (Integer num : numbers){
            numDeck.addCard(new Card<Integer>(num));
        }
        // Use the for each loop to print out the Integers in a deck.
        for (Card<Integer> card : numDeck){
            System.out.println(card);
        }


        // TODO: Make your own deck with your own class. Claim a prize once finished.
    }
}
