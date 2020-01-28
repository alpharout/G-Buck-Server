package de.craftrout.gbuck.server.main;

import de.craftrout.gbuck.server.api.Server;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Server server = new Server(12345);

        server.waitForClient();
    }
}
