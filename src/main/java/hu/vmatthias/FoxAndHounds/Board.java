package hu.vmatthias.foxandhounds;

/**
 * <p> Board Initalization. </p>
 */

public class Board {

    public static String[][] gameboard = new String[8][8];

    public Board() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                gameboard[i][j] = "0";
            }
        }
        gameboard[0][1] = "H";
        gameboard[0][3] = "H";
        gameboard[0][5] = "H";
        gameboard[0][7] = "H";
        gameboard[7][0] = "F";

    }


    public static void main(String[] args) {
        new Board();
    }

}
