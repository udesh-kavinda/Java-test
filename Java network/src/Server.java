import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    private static final int PORT = 9090;

    public static void main(String[] args) throws IOException {
        //create a socket
        ServerSocket serverSocket = new ServerSocket(PORT);

        System.out.println("[Server] Waiting for Client connection ...  ");

        //create a connection
        Socket socket = serverSocket.accept();

        System.out.println("[Server] Client connected ");

        //create printWriter object
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println((new Date().toString()));

        System.out.println(printWriter);


        System.out.println("[Server] Sent and Closing ");
        printWriter.close();
        socket.close();
        serverSocket.close();


    }
}
