package Practicum_Review.Review02.DeckOfCards.Model;

import java.util.Comparator;

public class RankComparator implements Comparator<Card> {
    @Override
    public int compare(Card a, Card b) {
        Rank aRank = a.getRank();
        Rank bRank = b.getRank();

        return aRank.getRank() - bRank.getRank();
    }
}