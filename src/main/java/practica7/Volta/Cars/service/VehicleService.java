package practica7.Volta.Cars.service;

import java.util.List;
import practica7.Volta.Cars.service.dto.VehicleDTO;

public interface VehicleService {

    List<VehicleDTO> retrieveVehicles();

    List<VehicleDTO> retrieveVehiclesElectric(boolean electric);
}
