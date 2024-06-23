package dev.pkj.javabackendlld.ParkingLot;

import dev.pkj.javabackendlld.ParkingLot.controllers.TicketController;
import dev.pkj.javabackendlld.ParkingLot.dtos.IssueTicketRequestDto;
import dev.pkj.javabackendlld.ParkingLot.dtos.IssueTicketResponseDto;
import dev.pkj.javabackendlld.ParkingLot.models.ParkingLot;
import dev.pkj.javabackendlld.ParkingLot.models.Ticket;
import dev.pkj.javabackendlld.ParkingLot.models.VehicleType;
import dev.pkj.javabackendlld.ParkingLot.repositories.GateRepository;
import dev.pkj.javabackendlld.ParkingLot.repositories.ParkingLotRepository;
import dev.pkj.javabackendlld.ParkingLot.repositories.TicketRepository;
import dev.pkj.javabackendlld.ParkingLot.repositories.VehicleRepository;
import dev.pkj.javabackendlld.ParkingLot.services.TicketService;

public class client {
    public static void main(String[] args) {
        IssueTicketRequestDto requestDto = new IssueTicketRequestDto();
        requestDto.setGateId(123L);
        requestDto.setVehicleNumber("UP93EA2343");
        requestDto.setVehicleType(VehicleType.SUV);
        requestDto.setVehicleOwnerName("Piyush");

        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

        TicketService ticketService = new TicketService(gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository);

        TicketController ticketController = new TicketController(ticketService);
        IssueTicketResponseDto responseDto = ticketController.issueTicket(requestDto);
        Ticket ticket = responseDto.getTicket();
        System.out.println(ticket);

    }
}
