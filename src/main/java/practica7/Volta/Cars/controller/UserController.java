package practica7.Volta.Cars.controller;

import practica7.Volta.Cars.model.User;
import practica7.Volta.Cars.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController{
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<UserDTO>> getUsers(@RequestParam(required = false)) {
        List<UserDTO> response = userService.getUsers();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/user/vehicle")
    public ResponseEntity<List<UserDTO>> getUsersWithVehicles(@RequestParam(required = false)) {
        List<UserDTO> response = userService.getUsersWithVehicles();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/user/vehicle/outer")
    public ResponseEntity<List<UserDTO>> getAllUsersAllVehicles(@RequestParam(required = false)) {
        List<UserDTO> response = userService.getAllUsersAllVehicles();
        return ResponseEntity.ok().body(response);
    }
    

}