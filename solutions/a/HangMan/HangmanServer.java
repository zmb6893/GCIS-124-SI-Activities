package Practicum_Review.Final.HangMan;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HangmanServer extends Duplexer implements Runnable{

    private Hangman hangman;

    public HangmanServer(Socket socket, Hangman hangman) throws IOException {
        super(socket);
        this.hangman = hangman;
    }

    @Override
    public void run() {
        boolean sentinel = true;

        while(sentinel){
            String request = receive();
            String[] tokens = request.split(" ");

            switch(tokens[0].toUpperCase()){
                case "QUIT":
                    // modify the game
                    // send the result back
                    hangman.quit();
                    send("QUIT");
                    sentinel = false;
                    break;
                case "GUESS":
                    // Modify the game and send the result back
                    send(hangman.guess(tokens[1].charAt(0)));
                    break;
                default:
                    break;
            }
        }
    }
    public static void main(String[] args) {
        try{
            // create a server socket
            ServerSocket socket = new ServerSocket(42975);

            while(true){

                // accept a client socket connection
                Socket client = socket.accept();

                // create an instance of the server
                Hangman game = new Hangman();
                HangmanServer server = new HangmanServer(client, game);

                // call run
                new Thread(()->server.run()).start();
                //server.run();
            }
            //server.close();
        } catch (IOException e){}//squash

    }
}

