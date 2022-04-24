package Practicum_Review.Final.HangMan;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Duplexer {
    private final Socket socket;
    private final Scanner scanner;
    private final PrintWriter printWriter;

    public Duplexer(Socket socket) throws IOException{

        this.socket = socket;
        InputStream input = socket.getInputStream();
        this.scanner = new Scanner(input);
        OutputStream output = socket.getOutputStream();
        this.printWriter = new PrintWriter(output);
        
    }

    public void send(String data){
        System.out.println(">> " + data);
        printWriter.println(data);
        printWriter.flush();
    }

    public String receive(){
        String line = scanner.nextLine();
        System.out.println("<< " + line);
        return line;
    }

    public void close() {
        try{
            scanner.close();
            printWriter.close();
            socket.close();
        } catch(IOException e){
            // squash
        }
    }
}
