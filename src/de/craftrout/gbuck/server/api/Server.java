package de.craftrout.gbuck.server.api;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;

    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public boolean waitForClient() throws IOException {
        Socket client = serverSocket.accept();

        return true;
    }
}
