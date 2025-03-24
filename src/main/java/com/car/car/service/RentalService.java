package com.car.car.service;

import com.car.car.entity.BookingEntity;
import com.car.car.entity.CarEntity;
import com.car.car.entity.CustomerEntity;
import com.car.car.mapper.CarMapper;
import com.car.car.model.BookingRequestDTO;
import com.car.car.model.Car;
import com.car.car.repository.BookingRepository;
import com.car.car.repository.CarRepository;
import com.car.car.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class RentalService {

    @Autowired
    CarRepository carRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public List<Car> getAvailableCars(){
        List<CarEntity> carEntities = carRepository.findByAvailabilityTrue();
        return carEntities.stream().map(carEntity -> CarMapper.TO_MODEL.apply(carEntity)).collect(Collectors.toList());
    }

    public String rentCar(BookingRequestDTO bookingRequestDTO){
        Optional<CarEntity> carOpt = carRepository.findById(bookingRequestDTO.getCarId());
        Optional<CustomerEntity> customerOpt = customerRepository.findById(bookingRequestDTO.getCustomerId());

        if(carOpt.isPresent() && customerOpt.isPresent()){
            CarEntity carEntity = carOpt.get();
            if(carEntity.getAvailability() == false){
                return "Car already booked for rent, Please take another car";
            }
            if(carEntity == null){
                return "Car is not available";
            }
            carEntity.setAvailability(false);
            carRepository.save(carEntity);

            double totalCost = carEntity.getPrizePerDay() * bookingRequestDTO.getNoOfDays();
            double balanceAmount = totalCost - bookingRequestDTO.getPaidAmount();
            LocalDate bookingDate = LocalDate.now();
            LocalDate rentEndDate = bookingRequestDTO.getRentStartDate().plusDays(bookingRequestDTO.getNoOfDays());
            BookingEntity bookingEntity = new BookingEntity();
            bookingEntity.setBookingId(bookingEntity.getBookingId());
            bookingEntity.setCustomerId(bookingRequestDTO.getCustomerId());
            bookingEntity.setCarId(bookingRequestDTO.getCarId());
            bookingEntity.setBookingDate(bookingDate);
            bookingEntity.setNoOfDays(bookingRequestDTO.getNoOfDays());
            bookingEntity.setRentStartDate(bookingRequestDTO.getRentStartDate());
            bookingEntity.setRentEndDate(rentEndDate);
            bookingEntity.setBalanceAmount(balanceAmount);
            bookingEntity.setPaidAmount(bookingRequestDTO.getPaidAmount());
            bookingRepository.save(bookingEntity);

            return "Car Rented Sucessfully. Total cost for "+ bookingRequestDTO.getNoOfDays() + " days is ₹:" +totalCost;
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

//    public String rentStatus(UUID carId){
//        Optional<CarEntity> carOpt = carRepository.findByIdAndAvailability(carId);
//        if(carOpt.isPresent()){
//            CarEntity car = carOpt.get();
//            if(car.getAvailability() == true)
//                return "Car is available for booking";
//        }
//        return null;
//    }
}
