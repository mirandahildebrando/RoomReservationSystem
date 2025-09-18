package com.brando.RoomReservationSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brando.RoomReservationSystem.entity.Room;
import com.brando.RoomReservationSystem.repository.RoomRepository;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

        public Room createRoom(Room room) {
            return roomRepository.save(room);
        }

        public List<Room> getAllRooms() {
            return roomRepository.findAll();
        }

}
