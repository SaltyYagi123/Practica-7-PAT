package practica7.Volta.Cars.service;

import practica7.Volta.Cars.model.User;

public class UserService {
    // Aqui voy a definir mis casos base que defini en el repo, pero no son
    // necesarios incluirlos todos.

    //All data from HostTable 
    List<UserDTO> getUsers();

    //Inner-Join
    List<UserVehicleDTO> getUsersWithVehicles();

    //Full Outer Join
    List <UserVehicleDTO> getAllUsersAllVehicles();

}
