package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

public class WinnerVerifier {


    public boolean isWin(GameTable gameTable, char symbol) {

        if (winForHorizontal(gameTable, symbol)
                || winForVertical(gameTable, symbol)
                || winForFirstDiagonal(gameTable, symbol)
                || winForSecondDiagonal(gameTable, symbol)) {
            return true;
        }
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

    private boolean winForFirstDiagonal(GameTable gameTable, char symbol) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            Cell cell = new Cell(i, i);
            if (gameTable.getSign(cell) == symbol) {
                count++;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean winForSecondDiagonal(GameTable gameTable, char symbol) {
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 2; j >= 0; j--) {
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
}


