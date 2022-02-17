package week06.Session6B.cards;

import java.util.Iterator;

/**
 * In a deck of cards, you only have access to the top of the deck. You can either draw a card or add a card to the top of your deck.
 * @author Zoe Bingham
 */

//TODO: Make a deck Iterable and refactor deck to work with generic cards
public class Deck {
    
    private Card top;

    public Deck(Card top){
        this.top = top;
    }

    /**
     * Adds a card to the top of the deck.
     * @param next
     */
    public void addCard(Card next){
        next.setNext(this.top);
        this.top = next;
    }

    /**
     * Removes a card from the top of the deck.
     * @return
     */
    public Card drawCard(){
        if (this.top == null){
            throw new IndexOutOfBoundsException("You've reached the end of the deck!");
        }
        Card current = this.top;
        this.top = this.top.getNext();
        return current;
    }

}
