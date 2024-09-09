package com.car.car.service;

import com.car.car.entity.CarEntity;
import com.car.car.mapper.CarMapper;
import com.car.car.model.Car;
import com.car.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;


    public Car addCar(Car car){
        CarEntity carEntity = CarMapper.TO_ENTITY.apply(car);
        carRepository.save(carEntity);
        return CarMapper.TO_MODEL.apply(carEntity);
    }
}
