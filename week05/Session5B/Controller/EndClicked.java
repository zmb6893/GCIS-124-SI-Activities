package week05.Session5B.Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import solutions.week05.Session5B.Model.Game;

public class EndClicked implements EventHandler<ActionEvent>{

    private Game game;

    /**
     * Check the status of the game
     * @param game
     */
    public EndClicked(Game game){
        this.game = game;
    }

    @Override
    public void handle(ActionEvent arg0) {
        System.out.println(game.getState());
    }
    
}
