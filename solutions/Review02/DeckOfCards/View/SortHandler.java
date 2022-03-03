package solutions.Review02.DeckOfCards.View;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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

    public SortHandler(LinkedList<Card> deck, String sortType, GridPane pane){
        this.deck = deck;
        this.sortType = sortType;
        this.pane = pane;
    }

    @Override
    public void handle(ActionEvent arg0) {
        
        System.out.println(String.format("Sorting by %s...", sortType)); 
        String uri = new File("solutions/Review02/DeckOfCards/resources/audio/Card-flip-sound-effect.mp3").toURI().toString();
        Media media = new Media(uri);
        MediaPlayer player = new MediaPlayer(media);
        player.play();

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

    private void refreshPane(LinkedList<Card> deck){
        pane.getChildren().clear();
        int count = 0;
        for (int i = 0; i < 13; i++){
            for (int j = 0; j < 4; j++){
                pane.add(DeckGUI.cardMaker(deck.get(count)), i, j);
                count++;
            }
        }
    }
    
}
