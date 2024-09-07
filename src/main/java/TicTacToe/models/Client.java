package TicTacToe.models;

import TicTacToe.controllers.GameController;
import TicTacToe.exceptions.InvalidBotCountException;
import TicTacToe.exceptions.InvalidPlayerCountException;
import TicTacToe.strategies.winningStrategy.DiagonalWinningStrategy;
import TicTacToe.strategies.winningStrategy.RowWinningStrategy;
import TicTacToe.strategies.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws InvalidBotCountException, InvalidPlayerCountException {
//        Player p1 = new Player("Usama",new Symbol('X'),PlayerType.HUMAN);
//
////        Game.getBuilder();
//        Game game = Game.getBuilder().setDimension(3).setPlayer(new ArrayList<>()).setWinningStrategies(new ArrayList<>()).build();
        int dimension = 3;
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("Usama", new Symbol('X'), PlayerType.HUMAN));
        playerList.add(new Player("Ubada", new Symbol('O'), PlayerType.HUMAN));

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension, playerList, winningStrategies);

        gameController.printBoard(game);
    }
}
