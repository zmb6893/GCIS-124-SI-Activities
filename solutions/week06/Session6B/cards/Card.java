package solutions.week06.Session6B.cards;

/**
 * A card has a value and can point to the next card in a deck.
 * @author Zoe Bingham
 */

public class Card<E> {
    
    private E value;
    private Card<E> next;

    public Card(E value){
        this.value = value;
        this.next = null;
    }

    public void setNext(Card<E> next){
        this.next = next;
    }

    public Card<E> getNext(){
        return this.next;
    }

    @Override
    public String toString() {
        return String.format("[%s]", value.toString());
    }

}
