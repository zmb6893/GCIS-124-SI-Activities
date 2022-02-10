package week05.Session5B.Model;

/**
 * The game representation of a tic tac toe game
 * @author Zoe Bingham
 */

public class Game {
    private Board board;
    private GameState state;

    /**
     * A tic tac toe board
     * @param board
     */
    public Game(Board board){
        this.board = board;
        this.state = GameState.PLAYING;
    }

    public GameState getState(){
        return state;
    }

    /**
     * Change the tile at the specified row and column of the board
     * @param row
     * @param col
     */
    public void makeTurn(int row, int col){
        board.changeTile(row, col);
    }

}
