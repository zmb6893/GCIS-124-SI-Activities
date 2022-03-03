package solutions.Review02.DeckOfCards.Model;

import java.util.Comparator;
import java.util.Random;

public class RandomComparator implements Comparator<Card> {

    @Override
    public int compare(Card a, Card b) {
        Random random = new Random();
        
        int aRank = a.getRank().getRank() * random.nextInt(10);
        int bRank = b.getRank().getRank() * random.nextInt(10);

        return aRank - bRank;
    }
    
}
