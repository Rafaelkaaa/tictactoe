package academy.devonline.tictactoe.component;


import academy.devonline.tictactoe.model.GameTable;

import java.util.Random;

public class Game {

    private final DataPrinter dataPrinter;

    private final ComputerMove computerMove;

    private final UserMove userMove;

    private final WinnerVerifier winnerVerifier;

    private final CellVerifier cellVerifier;

    public Game(DataPrinter dataPrinter, ComputerMove computerMove, UserMove userMove, WinnerVerifier winnerVerifier, CellVerifier cellVerifier) {
        this.dataPrinter = dataPrinter;
        this.computerMove = computerMove;
        this.userMove = userMove;
        this.winnerVerifier = winnerVerifier;
        this.cellVerifier = cellVerifier;
    }


    public void play() {
        System.out.println("Use the following mapping table to specify a cell using number from 1 to 9");
        dataPrinter.printMappingTable();
        final GameTable gameTable = new GameTable();
        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
        }
        while (true) {
            userMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            System.out.println(dataPrinter.printWhoIsWin(gameTable));

            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            System.out.println(dataPrinter.printWhoIsWin(gameTable));
        }
    }
}
