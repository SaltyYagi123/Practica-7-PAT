package practica7.Volta.Cars.service;

import practica7.Volta.Cars.model.Vehicle;

public class VehicleService {
    Iterable<Vehicle> retrieveVehiclesByCarId(int carId);
    Iterable<Vehicle> retrieveVehiclesByElectric(boolean electricTF);
    Iterable<Vehicle> retrieveVehiclesByVehicleAge(int carAge);
}
