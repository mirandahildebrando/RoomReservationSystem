package com.brando.RoomReservationSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brando.RoomReservationSystem.entity.RoomReservation;
import com.brando.RoomReservationSystem.repository.RoomReservationRepository;

@Service
public class RoomReservationService {

    private final RoomReservationRepository roomReservationRepository;

    public RoomReservationService(RoomReservationRepository roomReservationRepository) {
        this.roomReservationRepository = roomReservationRepository;
    }

    public RoomReservation createReservation(RoomReservation RoomReservation) {
        return roomReservationRepository.save(RoomReservation);
    }

    public List<RoomReservation> getAllRoomsReservations() {
        return roomReservationRepository.findAll();
    } 

    

}
