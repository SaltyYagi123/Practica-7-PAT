package practica7.Volta.Cars.repository;

import practica7.Volta.Cars.model.*;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface HostsRepository extends CrudRepository<Vehicle, Long> {

    @Query("SELECT * FROM HOSTS WHERE HOSTS.USER_ID = :userId")
    public Iterable<Host> retrieveHostByUserId(Long userId);

    @Query("SELECT * FROM HOSTS WHERE HOSTS.CAR_ID = :carId")
    public Iterable<Host> retrieveHostByCarId(int carId);

    @Query("SELECT * FROM HOSTS WHERE HOSTS.CHARGER_LOCATION  = :chargerLocation")
    public Iterable<Host> retrieveHostByCarLocation(String chargerLocation);

    @Query("SELECT * FROM HOSTS WHERE HOSTS.HOURLY_RATE = :hourlyRate")
    public Iterable<Host> retrieveHostByHourlyRate(float hourlyRate);

    @Query("SELECT * FROM HOSTS WHERE HOSTS.RATING = :hostRating")
    public Iterable<Host> retrieveHostByHostRating(float hostRating);

    @Query("SELECT * FROM HOSTS WHERE HOSTS.NUMBER_USED = :numberUsed")
    public Iterable<Host> retrieveHostByHostRating(int numberUsed);c

    @Query("SELECT * FROM HOSTS WHERE HOSTS.IDENTIFICATION = :identification")

    public Iterable<Host> retrieveHostByHostRating(String identification);

}

/*
 * private @Column("RATING") float hostRating;
 * private @Column("NUMBER_USED") int numberUsed;
 * private @Column("IDENTIFICATION") String identification;
 * }
 */