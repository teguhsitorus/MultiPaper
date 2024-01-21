package puregero.multipaper.server;

import java.util.Scanner;

public class CommandLineInput extends Thread {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("stop")) { //Pterodactyl Support
                System.out.println("Shutting down servers...");
                ServerConnection.shutdownAndWait();
                System.exit(0);
            } else {
                System.out.println("Unknown command, use 'stop' to shutdown all servers or ctrl+c to stop just this master server");
            }
        }
    }

}
