package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

public class CellVerifier {
    public boolean isDraw(GameTable gameTable) {
        WinnerVerifier winnerVerifier = new WinnerVerifier();

        if (winnerVerifier.isWin(gameTable, 'X') ||
                winnerVerifier.isWin(gameTable, '0')) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameTable.isEmpty(new Cell(i, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
