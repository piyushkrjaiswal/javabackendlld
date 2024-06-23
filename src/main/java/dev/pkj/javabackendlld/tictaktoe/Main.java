package dev.pkj.javabackendlld.tictaktoe;

import dev.pkj.javabackendlld.tictaktoe.controllers.GameController;
import dev.pkj.javabackendlld.tictaktoe.exceptions.InvalidBotCountException;
import dev.pkj.javabackendlld.tictaktoe.exceptions.InvalidPlayerCountException;
import dev.pkj.javabackendlld.tictaktoe.models.*;
import dev.pkj.javabackendlld.tictaktoe.stratagies.winningstrategies.ColumnWinningStrategy;
import dev.pkj.javabackendlld.tictaktoe.stratagies.winningstrategies.DiagonalWinningStrategy;
import dev.pkj.javabackendlld.tictaktoe.stratagies.winningstrategies.RowWinningStrategies;
import dev.pkj.javabackendlld.tictaktoe.stratagies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidBotCountException, InvalidPlayerCountException {
//        Game game = Game.getBuilder().setPlayers(null).setSize(3).setWinningStrategies(null).build();
        int dimension = 3;
        List<Player> players = new ArrayList<>();
        players.add(new Player("Shashi", new Symbol('X'), PlayerType.HUMAN));
        players.add(new Player("Vandana", new Symbol('O'), PlayerType.BOT));

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategies(),
                new ColumnWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        GameController gameController = new GameController();
        Game game = gameController.startGame(
                                3,
                                players,
                                winningStrategies
        );

//        gameController.printBoard(game);
        while(game.getGameState().equals(GameState.IN_PROGRESS)) {
            gameController.printBoard(game);
            gameController.makeMove(game);
        }

    }
}
