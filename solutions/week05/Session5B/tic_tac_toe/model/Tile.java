package solutions.week05.Session5B.tic_tac_toe.model;

/**
 * A representation of a tile in a tic-tac-toe game. Holds the symbol at the tile. Acts as an observer.
 * @author Zoe Bingham
 */

public class Tile implements TileObserver{

    private Symbol symbol;

    public Tile(){
        this.symbol = Symbol.N; // Symbol should start out empty
    }

    @Override
    public String toString() {
        return "|" + symbol + "|";
    }

    public Symbol symbol(){
        return symbol;
    }

    @Override
    public void tileChanged() {
        this.symbol = this.symbol.flip();
    }
    
}
