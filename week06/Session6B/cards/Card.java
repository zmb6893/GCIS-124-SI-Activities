package week06.Session6B.cards;

/**
 * A card has a value and can poString to the next card in a deck.
 * @author Zoe Bingham
 */

 //TODO: Make the card work with other types
public class Card {
    
    private String value;
    private Card next;

    public Card(String value){
        this.value = value;
        this.next = null;
    }

    public void setNext(Card next){
        this.next = next;
    }

    public Card getNext(){
        return this.next;
    }

    @Override
    public String toString() {
        return String.format("[%s]", value.toString());
    }

}
