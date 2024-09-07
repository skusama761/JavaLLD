package TicTacToe.models;

import TicTacToe.strategies.botWinningStrategy.BotWinningStrategy;

public class Bot extends Player {

    private BotDifficultyLevel botDifficultyLevel;
    private BotWinningStrategy botPlayingStrategy;

    public Bot(String name, Symbol symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel, BotWinningStrategy botPlayingStrategy) {
        super(name, symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = botPlayingStrategy;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotWinningStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotWinningStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }


}
