package practica7.Volta.Cars.service.impl;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import practica7.Volta.Cars.repository.HostsRepository;
import practica7.Volta.Cars.service.dto.HostChargerDTO;
import practica7.Volta.Cars.service.dto.HostDTO;

public class HostServiceImplementation {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private HostsRepository hostRepository;

    @Override
    public List<HostDTO> getHosts() {
        return StreamSupport.stream(hostRepository.findAll().spliterator(), false)
                .map(obj -> new HostDTO(
                        obj.getUserId(),
                        obj.getCarId(),
                        obj.getChargerLocation(),
                        obj.getHourlyRate(),
                        obj.gethostRating(),
                        obj.getNumberUsed(),
                        obj.getIdentification()))
                .toList();
    }

    // Inner-Join
    @Override
    public List<HostChargerDTO> getHostsWithCharger() {

        String query = """
                SELECT HOSTS.USER_ID, CHARGERS.HOURLY_RATE, CHARGERS.CHARGER_ID, CHARGERS.CHARGER_NAME, CHARGERS.LATITUDE, CHARGERS.LONGITUDE, CHARGERS.POWER, HOST.RATING, HOST.USED_BY, HOST.IDENTIFICATION
                FROM HOSTS
                INNER JOIN CUSTOMERS ON HOSTS.USER_ID=CHARGERS.USER_ID;
                """;

        List<HostChargerDTO> chargerList = jdbcTemplate.query(
                query,
                (rs, rowNum) -> new HostChargerDTO(
                        rs.getLong("USER_ID"),
                        rs.getInt("CAR_ID"),
                        rs.getString("CHARGER_LOCATION"),
                        rs.getFloat("HOURLY_RATE"),
                        rs.getFloat("RATING"),
                        rs.getFloat("NUMBER_USED"),
                        rs.getFloat("IDENTIFICATION"),
                        rs.getInt("POWER"),
                        rs.getFloat("LATITUDE"),
                        rs.getFloat("LONGITUDE")));
        return chargerList;
    }

    @Override
    public List<HostChargerDTO> getAllHosts() {
        String query = """
                SELECT HOSTS.USER_ID, CHARGERS.HOURLY_RATE, CHARGERS.CHARGER_ID, CHARGERS.CHARGER_NAME, CHARGERS.LATITUDE, CHARGERS.LONGITUDE, CHARGERS.POWER, HOST.RATING, HOST.USED_BY, HOST.IDENTIFICATION
                FROM HOSTS
                LEFT OUTER JOIN CUSTOMERS ON HOSTS.USER_ID=CHARGERS.USER_ID;
                """;

        List<HostChargerDTO> chargerList = jdbcTemplate.query(
                query,
                (rs, rowNum) -> new HostChargerDTO(
                        rs.getLong("USER_ID"),
                        rs.getInt("CAR_ID"),
                        rs.getString("CHARGER_LOCATION"),
                        rs.getFloat("HOURLY_RATE"),
                        rs.getFloat("RATING"),
                        rs.getFloat("NUMBER_USED"),
                        rs.getFloat("IDENTIFICATION"),
                        rs.getInt("POWER"),
                        rs.getFloat("LATITUDE"),
                        rs.getFloat("LONGITUDE")));
        return chargerList;
    }

}
