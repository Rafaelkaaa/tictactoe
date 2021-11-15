package academy.devonline.tictactoe.keypad;

import academy.devonline.tictactoe.model.Cell;

public interface CellNumberConverter {

    Cell toCell(char number);

    char toNumber(Cell cell);
}
