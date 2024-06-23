package dev.pkj.javabackendlld.tictaktoe.factory;

import dev.pkj.javabackendlld.tictaktoe.models.BotDifficultyLevel;
import dev.pkj.javabackendlld.tictaktoe.stratagies.BotPlayingStrategies.BotPlayingStrategy;
import dev.pkj.javabackendlld.tictaktoe.stratagies.BotPlayingStrategies.EasyBotPlayingStrategy;
import dev.pkj.javabackendlld.tictaktoe.stratagies.BotPlayingStrategies.HardBotPlayingStrategy;
import dev.pkj.javabackendlld.tictaktoe.stratagies.BotPlayingStrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel) {
            if(difficultyLevel.equals(BotDifficultyLevel.EASY)) {
                return new EasyBotPlayingStrategy();
            } else if(difficultyLevel.equals(BotDifficultyLevel.MEDIUM)) {
                return new MediumBotPlayingStrategy();
            } else if(difficultyLevel.equals(BotDifficultyLevel.HARD)) {
                return new HardBotPlayingStrategy();
            }
            return null;
    }
}
