package dev.pkj.javabackendlld.ParkingLot.strategies;

import dev.pkj.javabackendlld.ParkingLot.models.Gate;
import dev.pkj.javabackendlld.ParkingLot.models.ParkingLot;
import dev.pkj.javabackendlld.ParkingLot.models.ParkingSpot;
import dev.pkj.javabackendlld.ParkingLot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType, Gate gate);
}
