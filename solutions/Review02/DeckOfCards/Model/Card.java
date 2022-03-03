package solutions.Review02.DeckOfCards.Model;

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
    public static void main(String[] args) {
        List<Card> cards = new LinkedList<>();
        cards.add(new Card(Rank.TEN, 
            Suit.DIAMONDS));
        cards.add(new Card(Rank.TWO, 
            Suit.SPADES));
        cards.add(new Card(Rank.ACE, 
            Suit.HEARTS));
        cards.add(new Card(Rank.FIVE, 
            Suit.HEARTS));
        cards.add(new Card(Rank.FIVE, 
            Suit.CLUBS));

        System.out.println(cards);

        Collections.sort(cards);

        System.out.println(cards);

        Collections.sort(cards, new RankComparator());

        System.out.println(cards);
    }
}
