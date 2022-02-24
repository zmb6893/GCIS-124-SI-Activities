package week07.Session7B.cards;

public class Main {
    public static void main(String[] args) {
        // What type of data structure is good for a deck of cards?

        
        // Add some players to the deck
        deck.add(new Card<Player>(Player.WARRIOR, Player.WARRIOR.getPowerLevel()));
        deck.add(new Card<Player>(Player.BARBARIAN, Player.BARBARIAN.getPowerLevel()));
        deck.add(new Card<Player>(Player.MAGE, Player.MAGE.getPowerLevel()));
        deck.add(new Card<Player>(Player.THEIF, Player.THEIF.getPowerLevel()));

        // Print out the list
        System.out.println(deck);

        // Sort the deck by power level
        deck.sort(null);

        // Print the sorted deck
        System.out.println(deck);

        // Sort the deck by alphabetical order
        deck.sort(new AlphabetComparator());

        // Print the sorted deck
        System.out.println(deck);

        // Can you come up with any other ways you might want to sort the deck?
    }
}
