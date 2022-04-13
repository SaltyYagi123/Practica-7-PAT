package practica7.Volta.Cars.repository;
import practica7.Volta.Cars.model.*;
import org.springframework.data.repository.CrudRepository;

public interface ECarsRepository extends CrudRepository<ECar, Long>{

    //Vale, para filtrar tenemos el electroc, modelo, y la edad del vehiculo 
    @Query("SELECT * FROM VEHICLES")

}

//  COSITAS DE REFERENCIA 

/*  @Query("SELECT * FROM CHARGER WHERE CHARGER.LONGITUDE= :longitude")
    public Iterable<Charger> retrieveChargersByLongitude(float longitude);

    @Query("SELECT * FROM CHARGER WHERE CHARGER.LONGITUDE= :longitude")
    public Iterable<Charger> retrieveChargersByLatitude(float latitude);
    
    @Query("SELECT * FROM CHARGER WHERE CHARGER.ID= :id")
    public Iterable<Charger> retrieveCharger(String id);
*/

/*
public class ECar {
    private @Column("USER_ID") @Id Long userId;
	private @Column("CAR_ID") Long carId;
	private @Column("ELECTROC") int age;
	private @Column("MODEL") String carModel;
    private @Column("VEHICLE AGE") int carAge;
}
*/