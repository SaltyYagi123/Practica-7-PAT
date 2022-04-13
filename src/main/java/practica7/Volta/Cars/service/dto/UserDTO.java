Cpackage practica7.Volta.Cars.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    Long userId;
    Long carId;
    int age;
    String country;
    String identification;
}
