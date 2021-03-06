package de.craftrout.gbuck.server.api;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private DataOutputStream dataOutputStream;
    private DataInputStream dataInputStream;

    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public boolean waitForClient() throws IOException {
        Socket client = serverSocket.accept();
        dataOutputStream = new DataOutputStream(client.getOutputStream());
        dataInputStream = new DataInputStream(client.getInputStream());

        dataOutputStream.writeUTF("Hallo Welt!");

        String msg = dataInputStream.readUTF();

        return true;
    }
}
