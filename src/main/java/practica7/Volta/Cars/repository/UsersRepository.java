package practica7.Volta.Cars.repository;
import practica7.Volta.Cars.model.*;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Vehicle, Long>{

    @Query("SELECT * FROM USERS WHERE USERS.USER_ID = :userId")
    public Iterable <User> retrieveUserByUserId(Long userId);

    @Query("SELECT * FROM USERS WHERE USERS.CAR_ID = :carId")
    public Iterable <User> retrieveUserByCarId(Long carId);

    @Query("SELECT * FROM USERS WHERE USERS.AGE = :userAge")
    public Iterable <User> retrieveUserByUserAge(int userAge);

    @Query("SELECT * FROM USERS WHERE USERS.COUNTRY = :userCountry")
    public Iterable <User> retrieveUserByUserCountry(Long userId);

    @Query("SELECT * FROM USERS WHERE USERS.IDENTIFICATION = :identification")
    public Iterable <User> retrieveUserByUserIdentification(String identification);
}


/*
private @Column("USER_ID") @Id Long userId;
	private @Column("CAR_ID") Long carId;
	private @Column("AGE") int age;
	private @Column("COUNTRY") String country;
    private @Column("IDENTIFICATION") String identification;
*/