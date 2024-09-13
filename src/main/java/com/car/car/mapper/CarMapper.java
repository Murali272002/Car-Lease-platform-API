package com.car.car.mapper;

import com.car.car.entity.CarEntity;
import com.car.car.model.Car;

import java.util.function.Function;

public class CarMapper {

    public static Function<CarEntity,Car> TO_MODEL = carEntity -> {
        Car car = new Car.Builder()
                .id(carEntity.getId())
                .model(carEntity.getModel())
                .brand(carEntity.getBrand())
                .noOfSeats(carEntity.getNoOfSeats())
                .availability(carEntity.getAvailability())
                .prizePerDay(carEntity.getPrizePerDay())
                .build();
        return car;
    };

    public static Function<Car, CarEntity> TO_ENTITY = (car) -> new CarEntity(car.getId(), car.getModel(), car.getBrand(), car.getNoOfSeats(), car.getAvailability(), car.getPrizePerDay());
}
