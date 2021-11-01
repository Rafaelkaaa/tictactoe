package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

public class DataPrinter {


    public DataPrinter(CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    private final CellNumberConverter cellNumberConverter;


    public void printMappingTable() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " +
                        cellNumberConverter.toNumber(new Cell(i, j)) + ' ');
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
}
