package solutions.week06.Session6B.cards;

import java.util.Iterator;

/**
 * In a deck of cards, you only have access to the top of the deck. You can either draw a card or add a card to the top of your deck.
 * @author Zoe Bingham
 */

public class Deck<E> implements Iterable<Card<E>> {
    
    private Card<E> top;

    public Deck(Card<E> top){
        this.top = top;
    }

    /**
     * Adds a card to the top of the deck.
     * @param next
     */
    public void addCard(Card<E> next){
        next.setNext(this.top);
        this.top = next;
    }

    /**
     * Removes a card from the top of the deck.
     * @return
     */
    public Card<E> drawCard(){
        if (this.top == null){
            throw new IndexOutOfBoundsException("You've reached the end of the deck!");
        }
        Card<E> current = this.top;
        this.top = this.top.getNext();
        return current;
    }

    @Override
    public Iterator<Card<E>> iterator() {
        return new DeckIterator<>(this.top);
    }
}
