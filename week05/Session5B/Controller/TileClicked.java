package week05.Session5B.Controller;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import solutions.week05.Session5B.Model.Board;

public class TileClicked implements EventHandler<ActionEvent>{

    public Button tile;
    public Board board;
    private int col;
    private int row;

    public TileClicked(Button tile, Board board, int row, int col){
        this.tile = tile;
        this.board = board;
        this.col = col;
        this.row = row;
    }

    @Override
    public void handle(ActionEvent arg0) {
        System.out.println("Clicked on a tile");
        System.out.println(arg0);
        System.out.println();
        // change the model based on the symbol
        board.changeTile(row, col);

        // change the view based on the model
        String path = board.getTile(row, col).sound();
        String uri = new File(path).toURI().toString();
        Media media = new Media(uri);
        MediaPlayer player = new MediaPlayer(media);
        player.play();
        ImageView image = new ImageView(new Image(board.getTile(row, col).image()));
        image.setFitHeight(80);
        image.setFitWidth(80);
        tile.setGraphic(image);
        System.out.println(board);
    }
    
}
