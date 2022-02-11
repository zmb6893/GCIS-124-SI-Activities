package week05.Session5B.tic_tac_toe.view;

import java.util.Scanner;

import week05.Session5B.tic_tac_toe.model.Game;
import week05.Session5B.tic_tac_toe.model.GameState;


/**
 * The Command Line Interface for a tic-tac-toe game.
 * @author Zoe Bingham
 */

public class tic_tac_toeCLI {
    /**
     * Receive input from the user.
     * @return int[row][col]
     */
    public static int[] promptTile(Scanner scanner){
        int row = 0;
        int col = 0;
        boolean invalidInput = true;

        System.out.println("Type \"move 0 0\"\n\b>>");

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
        Game game = new Game();
        boolean playing = true;
        Scanner scanner = new Scanner(System.in);
        while(playing){
            System.out.println(game);
            int[] input = promptTile(scanner);
            System.out.println(String.format("Attempting move at row: %d col: %d...", input[0], input[1]));
            game.makeMove(input[0], input[1]);
            playing = GameState.PLAYING == game.checkWin();
            System.out.println("Status " + game.checkWin());
        }
        System.out.println(game);
        scanner.close();
    }
}
