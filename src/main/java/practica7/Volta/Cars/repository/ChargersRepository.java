package practica7.Volta.Cars.repository;


import practica7.Volta.Cars.model.*;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface ChargersRepository extends CrudRepository<ChargerTable, String> {
    @Query("SELECT * FROM CHARGER WHERE CHARGER.LONGITUDE= :longitude")
    public Iterable<ChargerTable> retrieveChargersByLongitude(float longitude);
    @Query("SELECT * FROM CHARGER WHERE CHARGER.LONGITUDE= :longitude")
    public Iterable<ChargerTable> retrieveChargersByLatitude(float latitude);
    @Query("SELECT * FROM CHARGER WHERE CHARGER.ID= :id")
    public Iterable<ChargerTable> retrieveCharger(String id);
}