package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.keypad.CellNumberConverter;
import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

public class DataPrinter {


    public DataPrinter(CellNumberConverter desktopNumericKeypadCellNumberConverter) {
        this.desktopNumericKeypadCellNumberConverter = desktopNumericKeypadCellNumberConverter;
    }

    private final CellNumberConverter desktopNumericKeypadCellNumberConverter;


    public void printMappingTable() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " +
                        desktopNumericKeypadCellNumberConverter.toNumber(new Cell(i, j)) + ' ');
            }
            System.out.println("| ");
        }
        System.out.println("-------------");
    }

    public void printGameTable(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " +
                        gameTable.getSign(new Cell(i, j)) + ' ');
            }
            System.out.println("| ");
        }
        System.out.println("-------------");
    }

    public Object printWhoIsWin(GameTable gameTable) {
        CellVerifier cellVerifier = new CellVerifier();
        WinnerVerifier winnerVerifier = new WinnerVerifier();
        if (winnerVerifier.isWin(gameTable, '0')) {
            return "COMPUTER WIN\nGAME OVER";
        }
        if (winnerVerifier.isWin(gameTable, 'X')) {
            return "YOU WIN\nGAME OVER";
        }
        if (cellVerifier.isDraw(gameTable)) {
            return "SORRY DRAW\nGAME OVER";
        }
        return null;
    }

    public String printMessageForUserMove() {
        return "Please type number between 1 and 9:";
    }

    public String printMessageNotFreeCell() {
        return "Can't make a move, because the cell is not free! Try again";
    }

}
