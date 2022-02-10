package week05.Session5B.Model;

/**
 * The possible symbols of a tic tac to piece
 * @author: Zoe Bingham
 */

public enum Symbol {
    X("solutions/week05/Session5B/img/troll.jpg","solutions/week05/Session5B/sound/roar.wav"),
    O("solutions/week05/Session5B/img/goat.jpeg","solutions/week05/Session5B/sound/bleat.wav"),
    N();

    private String image;
    private String sound;

    private Symbol(String image, String sound){
        this.image = image;
        this.sound = sound;
    }

    private Symbol(){}

    public String image(){
        return image;
    }

    public String sound(){
        return sound;
    }

    /**
     * Return the next symbol
     * @return
     */
    public Symbol getOther(){
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
