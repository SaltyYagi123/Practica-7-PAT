package practica7.Volta.Cars.service.impl;


import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import practica7.Volta.Cars.repository.HostsRepository;

@Service
public class HostServiceImplementation implements HostService {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private HostsRepository hostsRepository;

    @Override
	public List<HostDTO> getHosts() {
		return StreamSupport.stream(hostsRepository.findAll().spliterator(), false)
				.map(obj -> new HostDTO(
						obj.getId(),
						obj.getCustomerName(),
						obj.getContactName(),
						obj.getCountry()))
				.toList();
	}


    @Override
	public List<HostDTO> getHostsWithCharger() {

		String query=
    			"""
    			SELECT H.USER_ID, H.CAR_ID, H.CHARGER_LOCATION, H.HOURLY_RATE, H.RATING, H.NUMBER_USED, H.IDENTIFICATION
				FROM HOSTS H, CHARGERS C
				WHERE H.USER_ID=C.USER_ID;
				""";

		List<HostDTO> hostList = jdbcTemplate.query(
				query,
				(rs, rowNum) ->
						new CustomerDTO(
								rs.getLong("USER_ID"),
								rs.getInteger("CAR_ID"),
								rs.getString("CHARGER_LOCATION"),
								rs.getFloat("HOURLY_RATE"), 
                                rs.getFloat("RATING"), 
                                rs.getInteger("NUMBER_USED"),
                                rs.getString("IDENTIFICATION"))
		);

		return orderList;
	}
}
