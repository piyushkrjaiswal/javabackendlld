package dev.pkj.javabackendlld.ParkingLot.controllers;

import dev.pkj.javabackendlld.ParkingLot.dtos.IssueTicketRequestDto;
import dev.pkj.javabackendlld.ParkingLot.dtos.IssueTicketResponseDto;
import dev.pkj.javabackendlld.ParkingLot.dtos.ResponseStatus;
import dev.pkj.javabackendlld.ParkingLot.exceptions.GateNotFoundException;
import dev.pkj.javabackendlld.ParkingLot.models.Ticket;
import dev.pkj.javabackendlld.ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto) {
        IssueTicketResponseDto responseDto = new IssueTicketResponseDto();
        try {
            Ticket ticket = ticketService.issueTicket(
                    requestDto.getGateId(),
                    requestDto.getVehicleNumber(),
                    requestDto.getVehicleOwnerName(),
                    requestDto.getVehicleType()
            );

            responseDto.setTicket(ticket);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);

        } catch (GateNotFoundException gateNotFoundException) {
            gateNotFoundException.getMessage();
            responseDto.setResponseStatus(ResponseStatus.FAILURE);

        }

        return responseDto;

    }


}
