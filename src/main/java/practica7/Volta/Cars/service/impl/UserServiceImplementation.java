package practica7.Volta.Cars.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practica7.Volta.Cars.service.UserService;
import practica7.Volta.Cars.service.dto.UserDTO;
import practica7.Volta.Cars.service.dto.UserVehicleDTO;
import practica7.Volta.Cars.repository.*;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UsersRepository userRepository;

    @Override
    public List<UserDTO> getUsers() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false)
                .map(obj -> new UserDTO(
                        obj.getUserId(),
                        obj.getCarId(),
                        obj.getAge(),
                        obj.getCountry(),
                        obj.getIdentification()))
                .toList();
    }

    // Inner-Join
    @Override 
    public List<UserVehicleDTO> getUsersWithVehicles(){
        
        String query = """ 
        SELECT USERS.USER_ID, USERS.CAR_ID, USERS.AGE, USERS.COUNTRY, USERS.IDENTIFICATION, VEHICLES.CAR_AGE, VEHICLES.CAR_MODEL, VEHICLES.ELECTRIC
        FROM USERS
        INNER JOIN VEHICLES ON USERS.USER_ID=VEHICLES.USER_ID;
        """;

        List <UserVehicleDTO> userList = jdbcTemplate.query(
            query, 
            (rs, rowNum) ->
                    new UserVehicleDTO(
                        rs.getLong("USER_ID"), 
                        rs.getLong("CAR_ID"),
                        rs.getInt("AGE"),
                        rs.getString("COUNTRY"), 
                        rs.getString("IDENTIFICATION"),
                        rs.getBoolean("ELECTRIC"),
                        rs.getString("MODEL"),
                        rs.getInt("VEHICLE_AGE"), 
                    )
        );
        return userList;
    }

    @Override 
    public List <HostChargerDTO> getAllHosts()
    {
        String query = """ 
        SELECT USERS.USER_ID, USERS.CAR_ID, USERS.AGE, USERS.COUNTRY, USERS.IDENTIFICATION, VEHICLES.CAR_AGE, VEHICLES.CAR_MODEL, VEHICLES.ELECTRIC
        FROM USERS
        LEFT OUTER JOIN VEHICLES ON USERS.USER_ID=VEHICLES.USER_ID;
        """;

        List <UserVehicleDTO> userList = jdbcTemplate.query(
            query, 
            (rs, rowNum) ->
                    new UserVehicleDTO(
                        rs.getLong("USER_ID"), 
                        rs.getLong("CAR_ID"),
                        rs.getInt("AGE"),
                        rs.getString("COUNTRY"), 
                        rs.getString("IDENTIFICATION"),
                        rs.getBoolean("ELECTRIC"),
                        rs.getString("MODEL"),
                        rs.getInt("VEHICLE_AGE"), 
                    )
        );
        return userList;
    }

    @Override
    public List<UserDTO> getUsers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserVehicleDTO> getUsersWithVehicles() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserVehicleDTO> getAllUsersAllVehicles() {
        // TODO Auto-generated method stub
        return null;
    }

}

/*
 * // Aqui voy a definir mis casos base que defini en el repo, pero no son
 * // necesarios incluirlos todos.
 * 
 * //All data from HostTable
 * List<UserDTO> getUsers();
 * 
 * //Inner-Join
 * List<UserVehicleDTO> getUsersWithVehicles();
 * 
 * //Full Outer Join
 * List <UserVehicleDTO> getAllUsersAllVehicles();
 */