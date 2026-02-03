package com.hotel.reservation.repository;

import com.hotel.reservation.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HotelRepository extends JpaRepository<HotelEntity,Long> {
    Optional<HotelEntity> findByEmail(String staff_email);

    Boolean existsByEmail(String staff_email);
}
