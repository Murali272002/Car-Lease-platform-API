package com.car.car.repository;

import com.car.car.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, UUID> {

  //  public String findByIdAndAvailability(UUID carId);
}
