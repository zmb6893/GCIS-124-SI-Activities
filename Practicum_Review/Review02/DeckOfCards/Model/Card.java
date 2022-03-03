package Practicum_Review.Review02.DeckOfCards.Model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Card implements Comparable<Card> {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    @Override
    public int compareTo(Card other) {
        String mySuit = suit.getSuit().toLowerCase();
        String otherSuit = other.suit.getSuit().toLowerCase();

        int result = mySuit.compareTo(otherSuit);
        if(result == 0) {
            return rank.getRank() - other.rank.getRank();
        } else {
            return result;
        }
    }

    @Override
    public String toString() {
        return rank.getRank() + " of " + suit.getSuit();
    }
}
