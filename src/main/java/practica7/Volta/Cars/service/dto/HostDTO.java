package practica7.Volta.Cars.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data 
@AllArgsConstructor
@NoArgsConstructor
public class HostDTO {

    Long userId;
    int carId;
    String chargerLocation;
    float hourlyRate;
    float hostRating;
    int numberUsed;
    String identification;
}
