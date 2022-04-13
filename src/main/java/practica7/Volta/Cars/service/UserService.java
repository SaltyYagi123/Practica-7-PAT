package practica7.Volta.Cars.service;

import practica7.Volta.Cars.model.User;

public class UserService {
    Iterable <User> retrieveUserByUserId(Long userId);
    Iterable <User> retrieveUserByCarId(Long carId);
    Iterable <User> retrieveUserByUserAge(int userAge);
    Iterable <User> retrieveUserByUserCountry(Long userId);
    Iterable <User> retrieveUserByUserIdentification(String identification);
}
