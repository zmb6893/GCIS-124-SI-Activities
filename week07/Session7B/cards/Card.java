package week07.Session7B.cards;

/**
 * A card has a value and can point to the next card in a deck.
 * @author Zoe Bingham
 */

 // how will we make a card sortable in a collection?
public class Card<E> {
    
    private E value;
    private Card<E> next;
    private int worth;

    public Card(E value, int worth){
        this.value = value;
        this.next = null;
        this.worth = worth;
    }

    public void setNext(Card<E> next){
        this.next = next;
    }

    public Card<E> getNext(){
        return this.next;
    }

    public E getValue(){
        return value;
    }

    @Override
    public String toString() {
        return String.format("[%s]", value.toString());
    }

}
