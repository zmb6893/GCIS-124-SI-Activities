package Practicum_Review.Final.HangMan;

import java.io.IOException;
import java.net.Socket;

public class HangmanProxy extends Duplexer implements HangmanInterface {

    public HangmanProxy(Socket socket) throws IOException {
        super(socket);
    }

    @Override
    public String guess(char c) {
        return "";
    }

    @Override
    public void quit() {
        
    }
    
}
