package com.car.car.repository;

import com.car.car.entity.CarEntity;
import com.car.car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, UUID> {

    public List<CarEntity> findByAvailabilityTrue();
}
