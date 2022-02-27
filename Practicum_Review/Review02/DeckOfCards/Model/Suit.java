package Practicum_Review.Review02.DeckOfCards.Model;

public enum Suit {
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private final String suit;

    private Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}