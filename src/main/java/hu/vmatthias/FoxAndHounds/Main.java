package hu.vmatthias.foxandhounds;

/**
 * Game start.
 *
 * @GetPlayerName - this class get the player's name from input
 * @MainMenu - this class show the menu
 * @MainMenuCommandPrompt - this class accepts the commands to the menu
 * @Board - this class showing the board, if you write the correct command
 * @InGameCP - this class accepts the IG commands
 *
 */
public class Main {

    /**
     *  Game start.
     *
     */
    public static void main(String[] args) throws Exception {
        new GetPlayerName();
        new MainMenu();
        new MainMenuCommandPrompt();
        new Board();
        new InGameCP();

    }


    }


