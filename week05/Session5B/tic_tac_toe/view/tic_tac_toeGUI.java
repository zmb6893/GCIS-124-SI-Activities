package week05.Session5B.tic_tac_toe.view;

import java.io.File;

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
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import week05.Session5B.tic_tac_toe.model.Game;
import week05.Session5B.tic_tac_toe.model.Symbol;
import week05.Session5B.tic_tac_toe.model.Tile;

/**
 * The GUI for a tic-tac-toe game for Goats vs Trolls.
 * @author Zoe Bingham
 */

public class tic_tac_toeGUI extends Application {
    public static final int ROWS = 3;
    public static final int COLS = 3;

    public Game game;

    @Override
    public void start(Stage stage) throws Exception {
        // Start a game
        game = new Game();

        // Title
        stage.setTitle("Goats vs Trolls");

        // Game Status
        Label status = new Label("PLAYING");

        // Tic Tac Toe Board
        GridPane pane = new GridPane(); 
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                Button tile = makeTile(i, j);
                pane.add(tile,i,j);
            }
        }

        // End Button
        Button end = new Button("Check for Win");
        end.setOnAction(new EndClicked(this, status));

        // Put everything together
        VBox layout = new VBox(status, pane, end);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Make a tile at a specified row and col.
     * @param row
     * @param col
     * @return
     */
    public Button makeTile(int row, int col){
        // Create a new button
        Button tile = new Button();
        tile.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, new Insets(5))));
        tile.setPrefSize(100, 100);

        // Prepare to handle a tile click event
        Tile t = game.getTile(row, col);
        tile.setOnAction(new TileClicked(this, tile, t, row, col));

        return tile;
    }

    /**
     * Change the tile at the specified location for the game.
     * @param row
     * @param col
     */
    public void makeMove(int row, int col){
        game.makeMove(row, col);
    }

    /**
     * Changes the text of the status to the current game status.
     * @param status
     */
    public void updateStatus(Label status){
        status.setText(game.checkWin().toString());
    }
    
    /**
     * Update the button to have the correct image and play the correct sound on change.
     * @param button
     * @param tile
     */
    public void updateButton(Button button, Tile tile){
        // Get the next tile state
        Symbol nextState = tile.symbol();

        // Get the image from the tile
        ImageView image = new ImageView(new Image(nextState.image()));
        image.setFitHeight(80); image.setFitWidth(80);
        button.setGraphic(image);

        // Get the audio from the tile
        String path = nextState.sound();
        String uri = new File(path).toURI().toString();
        Media media = new Media(uri);
        MediaPlayer player = new MediaPlayer(media);
        player.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
