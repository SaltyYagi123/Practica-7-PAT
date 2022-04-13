package practica7.Volta.Cars.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChargerDTO {
    int userId;
    int carId;
    int age;
    float latitude;
    float longitude;
    int carPower;
}
