import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    private static final String serverIp="127.0.0.1";
    private static final String serverPort="9090";



    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(serverIp, Integer.parseInt(serverPort));

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String responce =input.readLine();

        JOptionPane.showMessageDialog(null,responce);

        socket.close();
        System.exit(0);

    }
}
