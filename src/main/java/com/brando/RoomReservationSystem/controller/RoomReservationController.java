package com.brando.RoomReservationSystem.controller;

import com.brando.RoomReservationSystem.entity.RoomReservation;
import com.brando.RoomReservationSystem.service.RoomReservationService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomReservationController {

    private final RoomReservationService roomReservationService;

    public RoomReservationController(RoomReservationService roomReservationService) {
        this.roomReservationService = roomReservationService;
    }

    @PostMapping("/reservations")
    public ResponseEntity<RoomReservation> createReservation(@RequestBody RoomReservation roomReservation) {
        return ResponseEntity.ok(roomReservationService.createReservation(roomReservation));
    }

    @GetMapping("/reservations")
    public List<RoomReservation> getAllRoomsReservations() {
        return roomReservationService.getAllRoomsReservations();
    }




}
