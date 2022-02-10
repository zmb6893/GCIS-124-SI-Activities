package week05.Session5B.Model;

/**
 * A board for a tic tac toe board.
 */

public class Board {
    private Tile[][] board;
    private final int cols;
    private final int rows;

    public Board(int rows, int cols){
        this.board = new Tile[rows][cols];
        this.cols = cols;
        this.rows = rows;
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                board[row][col] = new Tile();
            }
        }
    }

    @Override
    public String toString() {
        String boardAsString = "";
        int i = 1;
        for(Tile[] col: board){
            for(Tile tile: col){
                boardAsString += tile;
            }
            if (i < rows){
                boardAsString += "\n---------\n";
                i++;
            }
        }
        return boardAsString;
    }

    /**
     * Changes the tile at the specified row and col to the symbol.
     * @param row
     * @param col
     */
    public void changeTile(int row, int col){
        this.board[row][col].changeSymbol();
    }

    public Symbol getTile(int row, int col){
        return this.board[row][col].getSymbol();
    }

    public static void main(String[] args) {
        Board board = new Board(3, 3);
        System.out.println(board);
    }
}
