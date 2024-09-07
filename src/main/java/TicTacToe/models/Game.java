package TicTacToe.models;

import TicTacToe.exceptions.InvalidBotCountException;
import TicTacToe.exceptions.InvalidPlayerCountException;
import TicTacToe.strategies.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<WinningStrategy> winningStrategies;
    private Board board;
    private List<Player> players;
    private List<Move> move;
    private Player winner;
    private GameState gameState;
    private int nextPlayerMoveIndex;

    private Game(int dimension, List<Player> player, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = player;
        this.winningStrategies = winningStrategies;
        this.move = new ArrayList<>();
        this.nextPlayerMoveIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public void makeMove() {
    }

    public void printBoard() {
        board.print();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMove() {
        return move;
    }

    public void setMove(List<Move> move) {
        this.move = move;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }


    //    BUILDER CLASS
    public static class Builder {
        private int dimension;
        private List<Player> player;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayer(List<Player> player) {
            this.player = player;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private void validateBotCount() throws InvalidBotCountException {
            int botCount = 0;
            for (Player player : player) {
                if (player.getPlayerType() == PlayerType.BOT) {
                    botCount++;
                }
            }

            if (botCount > 1) {
                throw new InvalidBotCountException("Count of Bots are greater that 1");
            }
        }

        private void validatePlayerCount() throws InvalidPlayerCountException {
            if (player.size() != dimension - 1) {
                throw new InvalidPlayerCountException("Player count is Invalid");
            }
        }

        private void validateUniqueSymbolsForEachPlayers() {

        }

        public void validate() throws InvalidBotCountException, InvalidPlayerCountException {
            validateBotCount();
            validatePlayerCount();
            validateUniqueSymbolsForEachPlayers();
        }

        public Game build() throws InvalidBotCountException, InvalidPlayerCountException {
            validate();
            return new Game(dimension, player, winningStrategies);
        }
    }

}
