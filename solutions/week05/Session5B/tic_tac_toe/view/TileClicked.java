package solutions.week05.Session5B.tic_tac_toe.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import solutions.week05.Session5B.tic_tac_toe.model.Tile;

/**
 * An event handler for when a tile is clicked. Updates the tile.
 * @author Zoe Bingham
 */

public class TileClicked implements EventHandler<ActionEvent> {

    private tic_tac_toeGUI gui;
    private Button tile;
    private Tile t;
    private int row;
    private int col;

    public TileClicked(tic_tac_toeGUI gui, Button tile, Tile t, int row, int col){
        this.gui = gui;
        this.tile = tile;
        this.t = t;
        this.row = row; this.col = col;
    }

    @Override
    public void handle(ActionEvent action) {
        gui.game.makeMove(row, col);
        gui.updateButton(tile, t);
    }
    
}
