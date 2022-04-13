package practica7.Volta.Cars.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practica7.Volta.Cars.model.Charger;
import practica7.Volta.Cars.repository.ChargersRepository;
import practica7.Volta.Cars.service.ChargerService;


@Service
public class ChargerServiceImplementation implements ChargerService {
    @Autowired
    private ChargersRepository chargerRepository;
    
    @Override
    public Iterable<Charger> retrieveChargerLat(String latitude) {
        if (latitude == null) {
            return chargerRepository.findAll();
        } else {
            float latitudeFloat = Float.parseFloat(latitude);
            return chargerRepository.retrieveChargersByLatitude(latitudeFloat);
        }
    }

    @Override
    public Iterable<Charger> retrieveChargerLong(String longitude) {
        if (longitude == null) {
            return chargerRepository.findAll();
        } else {
            float longitudeFloat = Float.parseFloat(longitude);
            return chargerRepository.retrieveChargersByLongitude(longitudeFloat);
        }
    }


    @Override
    public Charger retrieveCharger(String id) {
        Charger response = null;
        if (chargerRepository.existsById(id)) {
            Iterable<Charger> chargers =chargerRepository.retrieveCharger(id);
            for (Charger charger : chargers) {
                response = charger;
            }
            return response;
        }
        return response;
    }

    @Override
    public Charger updateCharger(String id, Charger charger) {
        if (chargerRepository.existsById(id)) {
            return chargerRepository.save(charger);
        } else {
            return null;
        }
    }

    @Override
    public void deleteCharger(String id) {
        chargerRepository.deleteById(id);
    }
}