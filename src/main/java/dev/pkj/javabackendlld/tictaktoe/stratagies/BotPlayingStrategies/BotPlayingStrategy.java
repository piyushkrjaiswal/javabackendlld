package dev.pkj.javabackendlld.tictaktoe.stratagies.BotPlayingStrategies;

import dev.pkj.javabackendlld.tictaktoe.models.Board;
import dev.pkj.javabackendlld.tictaktoe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
