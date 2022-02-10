package week05.Session5B.Model;

/**
 * The tile of a tic tac toe game.
 * @author: Zoe Bingham
 */

public class Tile {
    private Symbol currentSymbol;
    
    public Tile(){
        this.currentSymbol = Symbol.N;
    }

    /**
     * Changes the symbol to the next symbol in the sequence
     * @param symbol
     */
    public void changeSymbol(){
        if (this.currentSymbol == Symbol.N || this.currentSymbol == Symbol.X){
            this.currentSymbol = Symbol.O;
        } else {
            this.currentSymbol = Symbol.X; 
        }
    }

    public Symbol getSymbol(){
        return currentSymbol;
    }

    @Override
    public String toString() {
        return String.format("|%s|", currentSymbol);
    }
}
