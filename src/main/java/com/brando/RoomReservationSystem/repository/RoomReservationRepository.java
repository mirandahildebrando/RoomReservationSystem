package com.brando.RoomReservationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brando.RoomReservationSystem.entity.RoomReservation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface RoomReservationRepository extends JpaRepository<RoomReservation, Long> {

    List<RoomReservation> ativeReservation(
            LocalDate date,
            LocalTime currentTimeStart,
            LocalTime currentTimeEnd
    );

}
