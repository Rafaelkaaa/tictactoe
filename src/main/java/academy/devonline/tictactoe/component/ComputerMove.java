package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

import java.util.Random;

public class ComputerMove {
    public void make(GameTable gameTable) {
        while (true) {
            Random random = new Random();
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            final Cell cell = new Cell(row, col);

            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, '0');
                return;
            }
        }
    }
}

