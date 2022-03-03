package solutions.Review02.DeckOfCards.View;

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
        stage.setTitle("Deck of Cards");
        Label title = new Label("Deck of Cards:");

        // Layout all the cards 13 x 4
        GridPane pane = new GridPane(); 
        int count = 0;
        for (int i = 0; i < 13; i++){
            for (int j = 0; j < 4; j++){
                pane.add(cardMaker(deck.get(count)), i, j);
                count++;
            }
        }

        // Have a button at the bottom of the GUI for sorts
        Button rSortBtn = new Button("Rank Sort");
        rSortBtn.setOnAction(new SortHandler(deck, "rank", pane));
        Button sSortBtn = new Button("Suit Sort");
        sSortBtn.setOnAction(new SortHandler(deck, "suit", pane));
        Button ranSortBtn = new Button("Random Sort");
        ranSortBtn.setOnAction(new SortHandler(deck, "random", pane));
        HBox buttons = new HBox();
        buttons.getChildren().addAll(rSortBtn, sSortBtn, ranSortBtn);
        buttons.setAlignment(Pos.CENTER);

        // When this button is clicked, sort the cards.
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(title, pane, buttons);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Makes a label representation of a card.
     */
    public static Label cardMaker(Card card){
        ImageView image = new ImageView(new Image("solutions/Review02/DeckOfCards/resources/img/club.png"));

        // Set the appropriate image
        switch (card.getSuit()){
            case CLUBS:
                image = new ImageView(new Image("solutions/Review02/DeckOfCards/resources/img/club.png"));
                break;
            case DIAMONDS:
                image = new ImageView(new Image("solutions/Review02/DeckOfCards/resources/img/diamond.png"));
                break;
            case HEARTS:
                image = new ImageView(new Image("solutions/Review02/DeckOfCards/resources/img/heart.png"));
                break;
            case SPADES:
                image = new ImageView(new Image("solutions/Review02/DeckOfCards/resources/img/spade.png"));
                break;
            default:
                break;
        }
        image.setFitHeight(20);
        image.setFitWidth(20);

        Label cardLabel = new Label(card.toString()+"\n", image);
        cardLabel.setBackground(new Background(new BackgroundFill(Color.LIGHTSTEELBLUE, new CornerRadii(10), new Insets(5))));
        cardLabel.setPrefSize(100, 125);
        cardLabel.setWrapText(true);
        cardLabel.setPadding(new Insets(10));
        return cardLabel;
    }

    public static void main(String[] args) {
        launch(args);
    }
    

}
