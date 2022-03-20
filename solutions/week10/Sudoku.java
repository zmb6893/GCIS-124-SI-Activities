import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import backtracker.Backtracker;
import backtracker.Configuration;

/**
 * Sudoku backtracker
 * @author 
 */

// What should we do to make sure that we can backtrack?
public class Sudoku implements Configuration {
    // A sudoku board is a 2D array of ints
    public int[][] board = new int[9][9];

    public Sudoku (int[][] board){
        this.board = board;
    }

    /**
     * The board as a string
     */
    @Override
    public String toString() {
        String string = "";

        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board.length; j++){
                
                if(board[i][j] != 0){
                    // add the non-empty space
                    string+=(this.board[i][j] + " ");
                } else {
                    // add an empty space
                    string+=("  ");
                }
    
                if((j+1)%3 == 0 && j != 8){
                    string+=("|");
                }
            }
            string+="\n";
            if ((i+1)%3 == 0 && i != 8){
                string+=("------+------+------\n");
            }
        }

        return string;
    }

    @Override
    public Collection<Configuration> getSuccessors() {
        // Make a list of successors
        Collection<Configuration> successors = new ArrayList<>();

        // if the space is empty, attempt a move and add to successors
        int[] nextEmpty = getNextEmpty();
        // If the board is complete, return the current sudoku
        if (nextEmpty == null){
            successors.add(this);
            return successors;
        }

        // Make a successor for every possible move at this position
        for (int num = 1; num <= 9; num++){ 
            int[][] newBoard = deepCopy(board);
            newBoard[nextEmpty[0]][nextEmpty[1]] = num;
            Sudoku successor = new Sudoku(newBoard);
            successors.add(successor); 
        }        

        return successors;
    }

    /**
     * Retrieve the next empty location on the board
     * @return
     */
    public int[] getNextEmpty(){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board[i][j] == 0){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * Make a deep copy of a sudoku puzzle board
     * @param board
     * @return
     */
    public int[][] deepCopy(int[][] board){
        int[][] copy = new int[9][9];
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                copy[i][j] = board[i][j];
            }
        }
        return copy;
    }

    /**
     * Checks to make sure that a configuration of the board has no duplicate numbers in rows, cols, or 3X3 cells
     */
    @Override
    public boolean isValid() { 
        for (int num = 1; num < 9; num++){
            // Check if the same number is in the same row.
            for (int i = 0; i < 9; i++){
                HashMap<Integer, Integer> numCount = new HashMap<>(){{put(0,1);put(1,0);put(2,0);put(3,0);put(4,0);put(5,0);put(6,0);put(7,0);put(8,0);put(9,0);}};
                for (int j = 0; j < 9; j++){
                    numCount.put(board[i][j], numCount.get(board[i][j])+1);
                }
                for(int key = 1; key <= 9; key++){
                    if (numCount.get(key) > 1){
                        return false;
                    }
                }
            }

            // Check if the same number is in the same column
            for (int i = 0; i < 9; i++){
                HashMap<Integer, Integer> numCount = new HashMap<>(){{put(0,1);put(1,0);put(2,0);put(3,0);put(4,0);put(5,0);put(6,0);put(7,0);put(8,0);put(9,0);}};
                for (int j = 0; j < 9; j++){
                    numCount.put(board[j][i], numCount.get(board[j][i])+1);
                }
                for(int key = 1; key <= 9; key++){
                    if (numCount.get(key) > 1){
                        return false;
                    }
                }
            }

            // Check to see if the same number is in the same 3X3 box
            for (int k = 0; k <= 6; k+=3){
                HashMap<Integer, Integer> numCount = new HashMap<>(){{put(0,1);put(1,0);put(2,0);put(3,0);put(4,0);put(5,0);put(6,0);put(7,0);put(8,0);put(9,0);}};
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 3; j++){
                        numCount.put(board[j][i], numCount.get(board[j][i])+1);
                    }
                    for(int key = 1; key <= 9; key++){
                        if (numCount.get(key) > 1){
                            return false;
                        }
                    }
                }
            }
        }
        // If there are no duplicate values in any row, col, or 3X3 Cell, return true.
        return true; 
    }

    /**
     * Checks if the board has been filled
     * @return
     */
    public boolean isFilled(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                // if there is a zero in the board, than the board is not empty
                if (board[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the current configuration of sudoku is valid and no more moves remain
     */
    @Override
    public boolean isGoal() {
        return this.isValid() && this.isFilled();   // return true if the board has been filled and is valid
    }

    public static void main(String[] args) {
        int board[][] = { 
        { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
        { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
        { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        Sudoku sudoku = new Sudoku(board);
        Backtracker bt = new Backtracker(true);
        Configuration solution = bt.solve(sudoku);
        if(solution == null){
            System.out.println("no solution");
        } else {
            System.out.println(solution);
        }
    }
}