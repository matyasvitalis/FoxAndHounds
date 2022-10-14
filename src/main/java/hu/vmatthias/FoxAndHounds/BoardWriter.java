package hu.vmatthias.foxandhounds;

import java.util.Arrays;

/**
 * This class will write the Board to the console.
 */
public class BoardWriter {

    public BoardWriter() {
        for (int x = 0; x < 8; x++) {
            System.out.println(Arrays.toString(Board.gameboard[x]));
        }
    }

    }

