package practica7.Volta.Cars.service;

public class HostService {
    // Aqui voy a definir mis casos base que defini en el repo, pero no son
    // necesarios incluirlos todos.
    Iterable<Host> retrieveHostCarId(int carId);

    Iterable<Host> retrieveHostCarLocation(String chargerLocation);

    Iterable<Host> retrieveHostHourlyRate(float hourlyRate);

    Iterable<Host> retrieveHostRating(float hostRating);

    Host retrieveHost(Long userId);

    Host updateHost(String id, Host host);

    void deleteHost(String id);

    // Aqui voy a definir mis casos con el JOIN
}
