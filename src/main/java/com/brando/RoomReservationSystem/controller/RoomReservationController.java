package com.brando.RoomReservationSystem.controller;

import com.brando.RoomReservationSystem.entity.RoomReservation;
import com.brando.RoomReservationSystem.service.RoomReservationService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomReservationController {

    private final RoomReservationService roomReservationService;

    public RoomReservationController(RoomReservationService roomReservationService) {
        this.roomReservationService = roomReservationService;
    }

    public ResponseEntity<RoomReservation> createReservation(@RequestBody RoomReservation roomReservation) {
        return ResponseEntity.ok(roomReservationService.createReservation(roomReservation));
    }

    public List<RoomReservation> getAllRoomsReservations() {
        return roomReservationService.getAllRoomsReservations();
    }




}
