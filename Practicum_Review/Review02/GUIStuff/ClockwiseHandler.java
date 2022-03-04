package Practicum_Review.Review02.GUIStuff;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Practicum_Review.Review02.GUIStuff.numbersGUI;

public class ClockwiseHandler implements EventHandler<ActionEvent> {

    private numbersGUI gui;

    public ClockwiseHandler(numbersGUI gui){
        this.gui = gui;
    }

    @Override
    public void handle(ActionEvent arg0) {
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                gui.grid[i][j] = ((gui.grid[i][j] - 1) % 4 > 0) ? (gui.grid[i][j] - 1) % 4 : 4;
                
                numbersGUI.updateNumLabel(gui.lGrid[i][j], gui.grid[i][j]);
            }
        }
    }
    
}
