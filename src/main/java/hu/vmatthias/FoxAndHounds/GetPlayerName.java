package hu.vmatthias.foxandhounds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class gets the player's name from the input.
 */
public class GetPlayerName {

    private static String playerName;

    public static String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        GetPlayerName.playerName = playerName;
    }

    public GetPlayerName() throws IOException {
        System.out.println("What is your player name? ");
        BufferedReader inputPlayer = new BufferedReader(new InputStreamReader(System.in));
        playerName = inputPlayer.readLine();

    }

}
