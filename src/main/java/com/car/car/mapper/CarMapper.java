package com.car.car.mapper;

import com.car.car.entity.CarEntity;
import com.car.car.model.Car;

import java.util.function.Function;

public class CarMapper {

    public static Function<CarEntity,Car> TO_MODEL = carEntity -> {
        Car car = new Car.Builder()
                .id(carEntity.getId())
                .carName(carEntity.getCarName())
                .companyName(carEntity.getCompanyName())
                .noOfSeats(carEntity.getNoOfSeats())
                .co2Emission(carEntity.getCo2Emission())
                .build();
        return car;
    };

    public static Function<Car, CarEntity> TO_ENTITY = (car) -> new CarEntity(car.getId(), car.getCarName(), car.getCompanyName(), car.getNoOfSeats(), car.getCo2Emission());
}
