package week05.Session5B.View;

import java.util.InputMismatchException;
import java.util.Scanner;

import solutions.week05.Session5B.Model.Board;
import solutions.week05.Session5B.Model.Game;
import solutions.week05.Session5B.Model.GameState;
import solutions.week05.Session5B.Model.Symbol;

public class TicTacToeCLI {
    public static int[] promptTile(Scanner scanner){
        int row = 0;
        int col = 0;
        boolean invalidInput = true;

        System.out.println("Type \"move 0 0\"");

        while(invalidInput){
            String input = scanner.nextLine();
            if (input.contains("move")){
                String[] tokens = input.split(" ");
                try{
                    row = Integer.parseInt(tokens[1]);
                    col = Integer.parseInt(tokens[2]);
                    invalidInput = false;
                } finally{}
            }
        }

        return new int[]{row, col};
    }

    public static void main(String[] args) {
        // Initialize the game
        int rows = 3; int cols = 3;
        Board board = new Board(rows, cols);
        Game game = new Game(board);

        // Prepare for input
        Scanner scanner = new Scanner(System.in);
        while(game.getState() != GameState.ENDED){
            System.out.println(board);
            int[] input = promptTile(scanner);
            System.out.println(String.format("Attempting move at row: %d \tcol: %d", input[0], input[1]));
            board.changeTile(input[0], input[1]);
        }
        scanner.close();
    }
}
