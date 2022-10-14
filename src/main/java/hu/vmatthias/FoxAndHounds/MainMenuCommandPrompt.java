package hu.vmatthias.foxandhounds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class gets the command input from the user.
 */
public class MainMenuCommandPrompt {
        private static String inputCommand;

    public MainMenuCommandPrompt() throws IOException {

        BufferedReader readInputCommand = new BufferedReader(new InputStreamReader(System.in));
        inputCommand = readInputCommand.readLine();
        switch (MainMenuCommandPrompt.getInputCommand()) {
            case "play":
                System.out.println("Loading game..");
                break;
            case "settings":
                System.out.println("TEST");
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

    public static String getInputCommand() {
        return inputCommand;
    }

    public void setInputCommand(String inputCommand) {
        MainMenuCommandPrompt.inputCommand = inputCommand;
    }
}
