package practica7.Volta.Cars.service;

import java.util.List;

import practica7.Volta.Cars.model.Vehicle;
import practica7.Volta.Cars.service.dto.VehicleDTO;

public interface VehicleService {

    List<VehicleDTO> getVehicles();

    List<VehicleDTO> getVehiclesWithUsers();
}
