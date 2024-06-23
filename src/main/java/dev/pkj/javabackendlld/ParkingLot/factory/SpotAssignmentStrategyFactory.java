package dev.pkj.javabackendlld.ParkingLot.factory;

import dev.pkj.javabackendlld.ParkingLot.models.SpotAssignmentStrategyType;
import dev.pkj.javabackendlld.ParkingLot.strategies.RandomSpotAssignmentStrategy;
import dev.pkj.javabackendlld.ParkingLot.strategies.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategyForType
            (SpotAssignmentStrategyType spotAssignmentStrategyType) {
        return new RandomSpotAssignmentStrategy();
    }
}
