package week05.Session5B.tic_tac_toe.model;

/**
 * Game logic of tic-tac-toe. Holds the game state and the board.
 * @author Zoe Bingham
 */

public class Game {
    private final int ROWS = 3;
    private final int COLS = 3;

    private Tile[][] board;
    private GameState state;

    public Game(){
        // Initialize the game board
        board = new Tile[ROWS][COLS];
        for (int i = 0; i < ROWS; i++){
            for (int j = 0; j < COLS; j++){
                board[i][j] = new Tile();
            }
        }
        this.state = GameState.PLAYING; // GameState starts out at PLAYING
    }

    @Override
    public String toString() {
        String boardAsString = "";
        int i = 1;
        for(Tile[] col: board){
            for(Tile tile: col){
                boardAsString += tile;
            }
            if (i < ROWS){
                boardAsString += "\n---------\n";
                i++;
            }
        }
        return boardAsString;
    }

    /**
     * Return the tile at the specified location.
     * @param row
     * @param col
     * @return
     */
    public Tile getTile(int row, int col){
        return board[row][col];
    }

    /**
     * Makes a move at the specified row and col
     * @param row
     * @param col
     */
    public void makeMove(int row, int col){
        board[row][col].tileChanged();
    }

    /**
     * Check if a game has been won.
     * @return current game state.
     */
    public GameState checkWin(){
        //Check each row
		for(int i = 0; i < 3; i++) {
			if(board[i][0].symbol() == board[i][1].symbol() && board[i][1].symbol() == board[i][2].symbol() && board[i][0].symbol() != Symbol.N) {
				this.state = board[i][0].symbol().winState();
                return state;
			}
		}

		//Check each column
		for(int i = 0; i < 3; i++) {
			if(board[0][i].symbol() == board[1][i].symbol() && board[1][i].symbol() == board[2][i].symbol() && board[0][i].symbol() != Symbol.N) {
				this.state = board[0][i].symbol().winState();
                return state;
			}
		}

		//Check the diagonals
		if(board[0][0].symbol() == board[1][1].symbol() && board[1][1].symbol() == board[2][2].symbol() && board[0][0].symbol() != Symbol.N) {
			this.state = board[0][0].symbol().winState();
            return state;
		}
		if(board[2][0].symbol() == board[1][1].symbol() && board[1][1].symbol() ==  board[0][2].symbol() && board[2][0].symbol() != Symbol.N) {
			this.state = board[2][0].symbol().winState();
            return state;
		}

		//Otherwise nobody has not won yet
        this.state = GameState.PLAYING;
        return state;
    }
}
