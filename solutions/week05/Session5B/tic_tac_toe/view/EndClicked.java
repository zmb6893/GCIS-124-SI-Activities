package solutions.week05.Session5B.tic_tac_toe.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

/**
 * Handles the event of clicking on the end button. Updates the status of the game.
 * @author Zoe Bingham
 */

public class EndClicked implements EventHandler<ActionEvent> {

    private tic_tac_toeGUI gui;
    private Label status;

    public EndClicked(tic_tac_toeGUI gui, Label status){
        this.gui = gui;
        this.status = status;
    }

    @Override
    public void handle(ActionEvent action) {
        gui.updateStatus(status);
    }
    
}
