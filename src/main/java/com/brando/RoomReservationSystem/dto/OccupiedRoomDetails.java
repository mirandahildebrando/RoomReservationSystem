package com.brando.RoomReservationSystem.dto;

import com.brando.RoomReservationSystem.entity.Status;

import java.time.LocalDate;
import java.time.LocalTime;

public record OccupiedRoomDetails(

        Long roomId,
        Status status,

        String reserverName,
        LocalDate checkInDate,
        LocalTime startTime,
        LocalTime endTime
) {
}
