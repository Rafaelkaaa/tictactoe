package academy.devonline.tictactoe;

import academy.devonline.tictactoe.component.*;
import academy.devonline.tictactoe.keypad.CellNumberConverter;
import academy.devonline.tictactoe.keypad.DesktopNumericKeypadCellNumberConverter;

public class Launcher {
    public static void main(String[] args) {
        final CellNumberConverter desktopNumericKeypadCellNumberConverter = new DesktopNumericKeypadCellNumberConverter();
        final Game game = new Game(
                new DataPrinter(desktopNumericKeypadCellNumberConverter),
                new ComputerMove(),
                new UserMove(desktopNumericKeypadCellNumberConverter, new DataPrinter(desktopNumericKeypadCellNumberConverter)),
                new WinnerVerifier(),
                new CellVerifier()
        );
        game.play();
    }
}
