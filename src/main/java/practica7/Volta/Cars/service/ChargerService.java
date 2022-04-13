package practica7.Volta.Cars.service;

import practica7.Volta.Cars.model.Charger;
public interface ChargerService {
    Iterable<Charger> retrieveChargerLat(String latitude);
    Iterable<Charger> retrieveChargerLong(String longitude);
    Charger retrieveCharger(String id);
    Charger updateCharger(String id, Charger charger);
    void deleteCharger(String id);
}
