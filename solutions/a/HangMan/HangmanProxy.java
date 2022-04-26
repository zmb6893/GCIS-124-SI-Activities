package Practicum_Review.Final.HangMan;

import java.io.IOException;
import java.net.Socket;

public class HangmanProxy extends Duplexer implements HangmanInterface {

    public HangmanProxy(Socket socket) throws IOException {
        super(socket);
    }

    @Override
    public String guess(char c) {
        send("GUESS " + c);
        String response = receive();
        
        return response;
    }

    @Override
    public void quit() {
        send("QUIT");
    }

    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost",42975);
            HangmanProxy proxy = new HangmanProxy(socket);
            Player player = new Player(proxy);
            player.playHangman();
        } catch (IOException e){
            //squash
        }
    }
    
}
