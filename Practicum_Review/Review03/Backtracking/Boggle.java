package Practicum_Review.Review03.Backtracking;

import java.util.Collection;
import java.util.LinkedList;

import Practicum_Review.Review03.Backtracking.backtracker.Backtracker;
import Practicum_Review.Review03.Backtracking.backtracker.Configuration;
import Practicum_Review.Review03.Backtracking.graphs.AdjacencyGraph;

/**
 * Backtracker for solving a game of boggle. Check out the instructions here:
 * https://www.geeksforgeeks.org/boggle-find-possible-words-board-characters/
 * 
 * Make sure to use the Backtracker and Configuration files provided.
 * 
 * (You can use a graph to get more practice with DFS)
 * 
 * @author Zoe Bingham
 */

public class Boggle {
    public static Boggle boggle;

    // Setup the boggle board in a static way
    static {
        String[] dictionary = {"SI", "GREEN", "RIT", "IS", "FRUIT", "SELL", "COOL"};
        // Boggle Board
        char board[][] = {  {'S', 'I', 'Q'},
                            {'C', 'O', 'R'},
                            {'A', 'P', 'O'}};

        boggle = new Boggle(dictionary, board);

        System.out.println("\n\n\nInitial Board:\n" + boggle + "\n\n\n");
    }

    private String[] dictionary;
    private char[][] board;
    private AdjacencyGraph word;

    public Boggle(String[] dictionary, char[][] board){
        this.dictionary = dictionary;
        this.board = board;
    }

    /**
     * Prints the boggle board
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (char[] row : board){
            for (char c : row){
                stringBuilder.append("[" + c + "] ");
            }
            stringBuilder.append('\n');
        }

        stringBuilder.append("Current: " + word);

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        // TODO: Uncomment once you have implemented the necessary interface
        /**
        Backtracker bt = new Backtracker(true);
        Configuration solution = bt.solve(boggle);
        
        if(solution == null){
            System.out.println("no solution");
        } else {
            System.out.println(solution);
        }
        */
    }
}
