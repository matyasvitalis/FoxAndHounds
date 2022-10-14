package hu.vmatthias.foxandhounds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class accepting the ingame commands.
 */
public class InGameCP {

    private static String InGameInputCommand;

    public InGameCP() throws IOException {
        for (int y = 0; y < 5; y++) {
            BufferedReader inGameCommand = new BufferedReader(new InputStreamReader(System.in));
            InGameInputCommand = inGameCommand.readLine();
            switch (InGameCP.getInGameInputCommand()) {
                case "board":
                    new BoardWriter();
                    break;
                case "exit":
                    System.out.println("Goodbye");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Unknown command. Try again.");
                    break;
            }
        }
    }

    public static String getInGameInputCommand() {
        return InGameInputCommand;
    }

    public static void setInGameInputCommand(String inGameInputCommand) {
        InGameInputCommand = inGameInputCommand;
    }
}
