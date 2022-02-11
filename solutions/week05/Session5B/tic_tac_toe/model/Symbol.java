package solutions.week05.Session5B.tic_tac_toe.model;

/**
 * Possible symbols in a game of tic-tac-toe. May have images or sounds associated with them.
 * @author Zoe Bingham
 */

public enum Symbol {
    X("solutions/week05/Session5B/tic_tac_toe/media/img/troll.jpg","solutions/week05/Session5B/tic_tac_toe/media/sound/roar.wav",GameState.TROLL_WIN),
    O("solutions/week05/Session5B/tic_tac_toe/media/img/goat.jpeg","solutions/week05/Session5B/tic_tac_toe/media/sound/bleat.wav",GameState.GOAT_WIN),
    N();

    private String image;
    private String sound;
    private GameState winState;

    private Symbol(String image, String sound, GameState winState){
        this.image = image;
        this.sound = sound;
        this.winState = winState;
    }

    private Symbol(){}

    /**
     * Returns the path of the image associated with the symbol.
     * @return String
     */
    public String image(){
        return image;
    }

    /**
     * Returns the path of the sound associated with the symbol.
     * @return String
     */
    public String sound(){
        return sound;
    }

    /**
     * Returns the win state associated with the symbol
     * @return GameState
     */
    public GameState winState(){
        return winState;
    }

    /**
     * Return the next symbol
     * @return the next symbol in the sequence
     */
    public Symbol flip(){
        if (this == Symbol.O){
            return Symbol.X;
        }
        if (this == Symbol.X){
            return Symbol.O;
        }
        if (this == Symbol.N){
            return Symbol.O;
        }
        return Symbol.N;
    }
}
