package practica7.Volta.Cars.service.impl;

public class UserServiceImplementation {

    /*
     * //All data from HostTable
     * List<UserDTO> getUsers();
     * 
     * //Inner-Join
     * List<UserVehicleDTO> getUsersWithVehicles();
     * 
     * //Full Outer Join
     * List <UserVehicleDTO> getAllUsersAllVehicles();
     */

    @Autowired
    private JdbcTemplate jdbcTemplate;

	@Autowired
	private UsersRepository userRepository;

	@Override
	public List<UserDTO> getUsers() {
		return StreamSupport.stream(UsersRepository.findAll().spliterator(), false)
				.map(obj -> new UserDTO(
						obj.getUserId(),
						obj.getCarId(),
						obj.getDate()))
				.toList();
	}

	//INNER-JOIN
	@Override
	public List<UserVehicleDTO> getUsersWithCustomer() {

		String query=
				"""
    			SELECT UserS.ID, CUSTOMERS.CONTACT_NAME, CUSTOMERS.CUSTOMER_NAME, CUSTOMERS.COUNTRY, UserS.User_DATE
				FROM UserS
				INNER JOIN CUSTOMERS ON UserS.CUSTOMER_ID=CUSTOMERS.ID;
				""";

		List<UserVehicleDTO> UserList = jdbcTemplate.query(
				query,
				(rs, rowNum) ->
						new UserVehicleDTO(
								rs.getLong("ID"),
								rs.getString("CONTACT_NAME"),
								rs.getString("CUSTOMER_NAME"),
								rs.getString("COUNTRY"),
								(rs.getTimestamp("User_DATE")!=null) ? rs.getTimestamp("User_DATE").toLocalDateTime() : null
						)
		);

		return UserList;
	}

	//LEFT JOIN
	@Override
	public List<UserVehicleDTO> getAllUsers() {

		String query=
				"""
    			SELECT UserS.ID, CUSTOMERS.CONTACT_NAME, CUSTOMERS.CUSTOMER_NAME, CUSTOMERS.COUNTRY, UserS.User_DATE
				FROM UserS
				LEFT JOIN CUSTOMERS ON UserS.CUSTOMER_ID=CUSTOMERS.ID;
				""";

		List<UserVehicleDTO> UserList = jdbcTemplate.query(
				query,
				(rs, rowNum) ->
						new UserVehicleDTO(
								rs.getLong("ID"),
								rs.getString("CONTACT_NAME"),
								rs.getString("CUSTOMER_NAME"),
								rs.getString("COUNTRY"),
								(rs.getTimestamp("User_DATE")!=null) ? rs.getTimestamp("User_DATE").toLocalDateTime() : null
						)
		);

		return UserList;
	}

	//LEFT JOIN
	@Override
	public List<UserVehicleDTO> getAllUsers2() {

		String query=
				"""
    			SELECT UserS.ID, CUSTOMERS.CONTACT_NAME, CUSTOMERS.CUSTOMER_NAME, CUSTOMERS.COUNTRY, UserS.User_DATE
				FROM UserS
				LEFT OUTER JOIN CUSTOMERS ON UserS.CUSTOMER_ID=CUSTOMERS.ID;
				""";

		//CASE 1:
		//LEFT JOIN CUSTOMERS ON UserS.CUSTOMER_ID=CUSTOMERS.ID;

		//CASE 2:
		//RIGHT JOIN CUSTOMERS ON UserS.CUSTOMER_ID=CUSTOMERS.ID;


		List<UserVehicleDTO> UserList = jdbcTemplate.query(
				query,
				(rs, rowNum) ->
						new UserVehicleDTO(
								rs.getLong("ID"),
								rs.getString("CONTACT_NAME"),
								rs.getString("CUSTOMER_NAME"),
								rs.getString("COUNTRY"),
								(rs.getTimestamp("User_DATE")!=null) ? rs.getTimestamp("User_DATE").toLocalDateTime() : null
						)
		);

		return UserList;
	}
}
