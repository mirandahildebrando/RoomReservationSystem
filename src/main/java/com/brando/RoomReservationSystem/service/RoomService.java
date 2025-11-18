package com.brando.RoomReservationSystem.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.brando.RoomReservationSystem.dto.OccupiedRoomDetails;
import com.brando.RoomReservationSystem.entity.Status;
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




        public long getTotalRooms () {
            return roomRepository.count();
        }

        public long getTotalRoomsByStatus (Status status){
            return roomRepository.countByStatus(status);
        }



    }
