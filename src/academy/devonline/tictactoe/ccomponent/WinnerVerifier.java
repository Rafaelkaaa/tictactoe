package academy.devonline.tictactoe.ccomponent;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

public class WinnerVerifier {
    public boolean isUserWin(GameTable gameTable) {

        return false;
    }

    public boolean isComputerWin(GameTable gameTable) {
        return false;
    }


    private boolean winForHorizontal(GameTable gameTable, char symbol) {
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                Cell cell = new Cell(i, j);
                if (gameTable.getSign(cell) == symbol) {
                    count++;
                }
                if (count == 3) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean winForVertical(GameTable gameTable, char symbol) {
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                Cell cell = new Cell(j, i);
                if (gameTable.getSign(cell) == 'X') {
                    count++;
                }
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}


