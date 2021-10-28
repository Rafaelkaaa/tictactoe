package academy.devonline.tictactoe;

import academy.devonline.tictactoe.ccomponent.*;

public class Launcher {
    public static void main(String[] args) {
        final Game game = new Game(
                new DataPrinter(), new ComputerMove(), new UserMove(), new WinnerVerifier(), new DrawVerifier()
        );
        game.play();
    }
}
