package com.car.car.service;

import com.car.car.entity.CarEntity;
import com.car.car.entity.CustomerEntity;
import com.car.car.mapper.CarMapper;
import com.car.car.model.Car;
import com.car.car.repository.CarRepository;
import com.car.car.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class RentalService {

    @Autowired
    CarRepository carRepository;

    @Autowired
    CustomerRepository customerRepository;

    public List<Car> getAvailableCars(){
        List<CarEntity> carEntities = carRepository.findByAvailabilityTrue();
        return carEntities.stream().map(carEntity -> CarMapper.TO_MODEL.apply(carEntity)).collect(Collectors.toList());
    }

    public String rentCar(UUID CustomerId,UUID carId,int days){
        Optional<CarEntity> carOpt = carRepository.findById(carId);
        Optional<CustomerEntity> customerOpt = customerRepository.findById(CustomerId);

        if(carOpt.isPresent() && customerOpt.isPresent()){
            CarEntity carEntity = carOpt.get();
            if(carEntity == null){
                return "Car is not available";
            }
            carEntity.setAvailability(false);
            carRepository.save(carEntity);

            int totalCost = carEntity.getPrizePerDay() * days;
            return "Car Rented Sucessfully. Total cost for "+ days + " days is ₹:" +totalCost;
        }
        return "Car or Customer not found";
    }

    public String returnCar(UUID carId){
        Optional<CarEntity> carEntity = carRepository.findById(carId);

        if(carEntity.isPresent()){
            CarEntity car = carEntity.get();
            car.setAvailability(true);
            carRepository.save(car);
            return "Car Returned Successfully.";
        }
        return "car not found.";
    }
}
