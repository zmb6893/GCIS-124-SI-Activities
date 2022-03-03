package solutions.Review02.DeckOfCards.Model;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    LinkedList<Card> deck = new LinkedList<>(); 

    public Deck(){
        initializeDeck();
    }

    public void initializeDeck(){
        for (Rank rank : Rank.values()){
            for (Suit suit : Suit.values()){
                deck.add(new Card(rank,suit));
            }
        }

        // randomly organize the deck
        Collections.sort(deck, new RandomComparator());
    }

    public LinkedList<Card> getDeck(){
        return deck;
    }
}
