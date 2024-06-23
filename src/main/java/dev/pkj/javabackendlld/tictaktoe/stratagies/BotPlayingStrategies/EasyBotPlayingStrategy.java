package dev.pkj.javabackendlld.tictaktoe.stratagies.BotPlayingStrategies;

import dev.pkj.javabackendlld.tictaktoe.models.Board;
import dev.pkj.javabackendlld.tictaktoe.models.Cell;
import dev.pkj.javabackendlld.tictaktoe.models.CellState;
import dev.pkj.javabackendlld.tictaktoe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements  BotPlayingStrategy{

    @Override
    public Move makeMove(Board board) {
        for(List<Cell> cells: board.getBoard()) {
            for(Cell cell: cells) {
                if(cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(
                            null,
                            cell
                    );
                }
            }
        }
        return null;
    }
}
