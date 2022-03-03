package Practicum_Review.Review02.DeckOfCards.View;

import java.util.LinkedList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import solutions.Review02.DeckOfCards.Model.Card;
import solutions.Review02.DeckOfCards.Model.Deck;

// make this into a javafx GUI
public class DeckGUI extends Application {
    // The deck that will be used for this example
    public static Deck DECK = new Deck();
    public static LinkedList<Card> deck = DECK.getDeck();

    @Override
    public void start(Stage stage) throws Exception {
        // Set the title of the GUI

        // TODO: Layout all the cards 13 x 4

        // TODO: Have a button at the bottom of the GUI for sorts
        // rank sort; suit sort; and random sort

        // TODO: Put everything together
        stage.show();
    }

    /**
     * Makes a label representation of a card.
     * @param card Card 
     */
    public static Label cardMaker(Card card){
        // Just a default image
        ImageView image = new ImageView(new Image("solutions/Review02/DeckOfCards/resources/img/club.png"));

        // TODO: Set the appropriate image. Hint: might want to use a switch statement
        
        // TODO: Set the size of the image to 20x20 px

        // TODO: Create the label for the card. The label should have an image and the card name.

        // TODO: Set the background of the label; slightly round the edges; set spacing to 5 px.

        // TODO: Set the card dimensions to 100x125 px

        // TODO: Set the padding of the card to 10 px.
        

        return null;
    }

    public static void main(String[] args) {
        launch(args);
    }
    

}
