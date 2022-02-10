package week05.Session5B.View;
import java.util.EventListener;

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
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import solutions.week05.Session5B.Controller.TileClicked;
import solutions.week05.Session5B.Model.Board;
import solutions.week05.Session5B.Model.Game;

public class TicTacToe extends Application {
    public static int rows = 3; public static int cols = 3;
    public static Board board = new Board(rows, cols);
    public static Game game = new Game(board);

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Goat-Troll-Toe");

        Label label = new Label("Welcome to GVT the tic-tac-toe game");

        // Make the pane for the tic tac toe game
        GridPane pane = new GridPane();        
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                Button trollLabel = makeTile(i, j);
                pane.add(trollLabel, i, j);
            }
        }

        Button end = new Button("End");
        
        VBox layout = new VBox(label, pane, end);
        layout.setAlignment(Pos.CENTER);
    
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Make a tile
     * @param filename
     * @return
     */
    public static Button makeTile(int row, int col){
        Button tile = new Button(" ");
        tile.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, CornerRadii.EMPTY, new Insets(10))));
        tile.setMaxSize(100, 100);
        tile.setMinSize(100, 100);
        tile.setOnAction(new TileClicked(tile, board, row, col));        
        return tile;
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}
