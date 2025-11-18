package com.brando.RoomReservationSystem.repository;

import com.brando.RoomReservationSystem.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brando.RoomReservationSystem.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    long countByStatus(Status status);

}
