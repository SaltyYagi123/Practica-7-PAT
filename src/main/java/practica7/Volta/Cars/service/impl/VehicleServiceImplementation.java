package practica7.Volta.Cars.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practica7.Volta.Cars.repository.VehiclesRepository;
import practica7.Volta.Cars.service.VehicleService;
import practica7.Volta.Cars.service.dto.VehicleDTO;

@Service
public class VehicleServiceImplementation implements VehicleService {
    @Autowired
    private VehiclesRepository vehicleRepository;

    @Override
    public List<VehicleDTO> retrieveVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public List<VehicleDTO> retrieveVehiclesElectric(boolean electric) {
            return vehicleRepository.retrieveVehiclesByElectric(electric);
    }

}

/*
 * List<VehicleDTO> getVehicles();
 * 
 * List<VehicleDTO> getVehiclesWithUsers();
 */