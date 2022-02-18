package solutions.week06.Session6B.cards;

import java.util.Iterator;

/**
 * An interator for a deck.
 * @author Zoe Bingham
 */

public class DeckIterator<E> implements Iterator<Card<E>> {

    private Card<E> currentCard;

    public DeckIterator(Card<E> card){
        this.currentCard = card;
    }

    @Override
    public boolean hasNext() {
        return currentCard != null;
    }

    @Override
    public Card<E> next() {
        Card<E> old = this.currentCard;
        this.currentCard = currentCard.getNext();
        return old;
    }
    
}
