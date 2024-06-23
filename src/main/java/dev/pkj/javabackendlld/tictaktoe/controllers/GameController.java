package dev.pkj.javabackendlld.tictaktoe.controllers;

import dev.pkj.javabackendlld.tictaktoe.exceptions.InvalidBotCountException;
import dev.pkj.javabackendlld.tictaktoe.exceptions.InvalidPlayerCountException;
import dev.pkj.javabackendlld.tictaktoe.models.Board;
import dev.pkj.javabackendlld.tictaktoe.models.Game;
import dev.pkj.javabackendlld.tictaktoe.models.GameState;
import dev.pkj.javabackendlld.tictaktoe.models.Player;
import dev.pkj.javabackendlld.tictaktoe.stratagies.winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws InvalidBotCountException, InvalidPlayerCountException {
        return Game.getBuilder()
                .setSize(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove(Game game) {

    }

    public GameState gameState(Game game) {
        return game.getGameState();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

    public Player gameWinner(Game game) {
        return null;
    }
}
