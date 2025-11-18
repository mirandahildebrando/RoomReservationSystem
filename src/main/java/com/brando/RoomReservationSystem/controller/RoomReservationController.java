package com.brando.RoomReservationSystem.controller;

import com.brando.RoomReservationSystem.entity.RoomReservation;
import com.brando.RoomReservationSystem.service.RoomReservationService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roomReservation")
public class RoomReservationController {

    private final RoomReservationService roomReservationService;

    public RoomReservationController(RoomReservationService roomReservationService) {
        this.roomReservationService = roomReservationService;
    }

    @PostMapping("/reservations")
    public ResponseEntity<RoomReservation> createReservation(@RequestBody RoomReservation roomReservation) {
        RoomReservation createReservation = roomReservationService.createReservation(roomReservation);
        return new ResponseEntity<>(createReservation, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<RoomReservation>> getAllRoomsReservations() {
        List<RoomReservation> roomReservations = roomReservationService.getAllRoomsReservations();
        if (roomReservations.isEmpty()){
            return ResponseEntity.noContent().build();
        } return ResponseEntity.ok(roomReservations);
    }




}
