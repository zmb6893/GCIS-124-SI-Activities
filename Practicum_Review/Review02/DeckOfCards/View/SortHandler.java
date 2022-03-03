package Practicum_Review.Review02.DeckOfCards.View;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import solutions.Review02.DeckOfCards.Model.Card;
import solutions.Review02.DeckOfCards.Model.RandomComparator;
import solutions.Review02.DeckOfCards.Model.RankComparator;

public class SortHandler implements EventHandler<ActionEvent> {

    private String sortType;
    private LinkedList<Card> deck;
    private GridPane pane;

    public SortHandler(){
        // What will you need in your constructor???
    }

    @Override
    public void handle(ActionEvent arg0) {
        
        System.out.println(String.format("Sorting by %s...", sortType)); 

        // TODO: Use the card flip sound effect whenever the button is clicked.
        
        // Sort accordingly
        if (sortType.equals("rank")){
            Collections.sort(deck, new RankComparator());
            refreshPane(deck);
        }else if (sortType.equals("suit")){
            Collections.sort(deck);
            refreshPane(deck);
        }else if (sortType.equals("random")){
            Collections.sort(deck, new RandomComparator());
            refreshPane(deck);
        }
               
    }

    // TODO: fill a pane with new content
    private void refreshPane(LinkedList<Card> deck){
        
    }
    
}
