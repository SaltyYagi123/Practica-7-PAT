package practica7.Volta.Cars.service;

public class HostService {
    // Aqui voy a definir mis casos base que defini en el repo, pero no son
    // necesarios incluirlos todos.

    //All data from HostTable 
    List<HostDTO> getHosts();

    //Inner-Join
    List<HostChargerDTO> getHostsWithCharger();

    //Left-Join 
    List <HostChargerDTO> getAllHosts();

}
