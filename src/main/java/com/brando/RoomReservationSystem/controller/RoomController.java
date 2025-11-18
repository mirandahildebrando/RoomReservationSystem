package com.brando.RoomReservationSystem.controller;

import java.util.List;

import com.brando.RoomReservationSystem.entity.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.brando.RoomReservationSystem.entity.Room;
import com.brando.RoomReservationSystem.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public ResponseEntity<Room> createRoom(@RequestBody Room romm) {
        Room createRoom = roomService.createRoom(romm);
        return new ResponseEntity<>(createRoom, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Long> getTotalRoomsByStatus(@RequestParam Status status) {
        long total = roomService.getTotalRoomsByStatus(status);
        return ResponseEntity.ok(total);
    }

}
