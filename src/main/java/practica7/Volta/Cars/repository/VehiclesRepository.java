package practica7.Volta.Cars.repository;
import practica7.Volta.Cars.model.*;
import org.springframework.data.repository.CrudRepository;

public interface VehiclesRepository extends CrudRepository<Vehicle, Long>{

    //Vale, para filtrar tenemos el electroc, modelo, y la edad del vehiculo 
    @Query("SELECT * FROM VEHICLES WHERE VEHICLES.CAR_ID = :carId")
    public Iterable<Vehicle> retrieveVehiclesByCarId(int carId);

    @Query("SELECT * FROM VEHICLES WHERE VEHICLES.CAR_ID = :electricTF")
    public Iterable<Vehicle> retrieveVehiclesByElectric(boolean electricTF);

    @Query("SELECT * FROM VEHICLES WHERE VEHICLES.MODEL := :vehicleAge")
    public Iterable<Vehicle> retrieveVehiclesByVehicleAge(int carAge);
}