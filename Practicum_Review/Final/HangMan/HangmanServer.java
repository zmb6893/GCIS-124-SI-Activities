package Practicum_Review.Final.HangMan;

import java.io.IOException;
import java.net.Socket;

public class HangmanServer extends Duplexer implements Runnable{

    private Hangman hangman;

    public HangmanServer(Socket socket, Hangman hangman) throws IOException {
        super(socket);
        this.hangman = hangman;
    }

    @Override
    public void run() {
        //TODO: What do we need to do here?        
    }
    
}
