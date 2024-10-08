package TicTacToe.controllers;

import TicTacToe.exceptions.InvalidBotCountException;
import TicTacToe.exceptions.InvalidPlayerCountException;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;
//import TicTacToe.models.printBoard;
import TicTacToe.models.Player;
import TicTacToe.strategies.winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> playerList, List<WinningStrategy> winningStrategies) throws InvalidBotCountException, InvalidPlayerCountException {
      return Game.getBuilder().setDimension(dimension).setPlayer(playerList).setWinningStrategies(winningStrategies).build();
    };

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public void printBoard(Game game){
        game.printBoard();
    }
}
