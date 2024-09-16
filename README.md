Car-Lease-Platform-APIs

Post : http://localhost:8080/api/customer  ---->  (This api will work for adding the Customer details to DB)
payload : {                 (Payload should be in JSON format)
    "name" : "Preeya",
    "street" : "s.g.palya",
    "zipCode" : 560027,
    "place" : "tavarkare",
    "eMail" : "preeya@gmail.com",
    "phoneNumber" : 1538663103
}

Post : http://localhost:8080/car/api/car  ----> (This api will work for adding the Car Entity to DB)
Payload : {                     (Payload should be in JSON format)
    "model" : "RollsRays",
    "brand" : "RR",
    "noOfSeats" : 5,
    "availability" : true,
    "prizePerDay" : 3000
}

GET : http://localhost:8080/rental/get-cars   ---->   (This api will work to check the available cars for booking)


POST : http://localhost:8080/rental/rent-car/customerId/146e0b1b-bedd-45c0-a203-33eae1c5aa93/carId/63420631-fbdb-4683-b6d2-8626d445177d/days/2    ----->  

                                                               (This api will work for booking the car for rent by using CustomerID, CarId & No.of Days they want)

                              Response : Car Rented Sucessfully. Total cost for 2 days is ₹:6000

      When you are returning the car Should use this API                                                                

Post : http://localhost:8080/rental/return-car/carId/63420631-fbdb-4683-b6d2-8626d445177d    (By keeping CarId you can return the car)

                            Response : Car Returned Successfully.

                                                                      
