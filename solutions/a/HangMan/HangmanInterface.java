package Practicum_Review.Final.HangMan;

/**
 * The methods necessary for a game of hangman.
 * @author: Zoe Bingham
 */

public interface HangmanInterface {
    /**
     * Attempts to make a guess on the current game of hangman and returns a message about the status of the game.
     * @param c
     * @return
     */
    String guess(char c);

    /**
     * Quit the current game.
     */
    void quit();


}
