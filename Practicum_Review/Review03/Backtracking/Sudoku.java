package Practicum_Review.Review03.Backtracking;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import Practicum_Review.Review03.Backtracking.backtracker.Backtracker;
import Practicum_Review.Review03.Backtracking.backtracker.Configuration;
/**
 * Sudoku backtracker
 * @author Zoe Bingham
 */

// What should we do to make sure that we can backtrack?
public class Sudoku {
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

        // TODO: if the space is empty, attempt a move and add to successors

        // TODO: If the board is complete, return the current sudoku

        // TODO: Make a successor for every possible move at this position
        

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
        // TODO: Why do we need to make a deep copy of the board?
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
        // TODO: Check if there are any duplicates of a number in any of the rows, cols, or cells
            // TODO: Check if the same number is in the same row.

            // TODO: Check if the same number is in the same column

            // TODO: Check to see if the same number is in the same 3X3 box
            
        return false; 
    }

    /**
     * Checks if the board has been filled
     * @return
     */
    public boolean isFilled(){
        // TODO: If there is a zero on the board, the board is not empty.
        return true;
    }

    /**
     * Checks if the current configuration of sudoku is valid and no more moves remain
     */
    @Override
    public boolean isGoal() {
        return false;
    }

    public static void main(String[] args) {
        int board[][] = { 
        { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        { 0, 5, 0, 0, 9, 4, 6, 0, 0 },
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