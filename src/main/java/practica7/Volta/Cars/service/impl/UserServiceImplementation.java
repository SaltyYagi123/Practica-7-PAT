package practica7.Volta.Cars.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practica7.Volta.Cars.service.UserService;
import practica7.Volta.Cars.repository.*;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UsersRepository UsersRepository;

    @Override
    public List<UserDTO> getUsers()
    {

    }

    
}

/*    // Aqui voy a definir mis casos base que defini en el repo, pero no son
    // necesarios incluirlos todos.

    //All data from HostTable 
    List<UserDTO> getUsers();

    //Inner-Join
    List<UserVehicleDTO> getUsersWithVehicles();

    //Full Outer Join
    List <UserVehicleDTO> getAllUsersAllVehicles();*/