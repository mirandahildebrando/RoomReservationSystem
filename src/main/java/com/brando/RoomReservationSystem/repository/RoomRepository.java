package com.brando.RoomReservationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brando.RoomReservationSystem.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
