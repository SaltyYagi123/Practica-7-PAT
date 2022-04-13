package practica7.Volta.Cars.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Data 
@AllArgsConstructor
@NoArgsConstructor
public record HostDTO (
    Long userId,
    int carId,
    String chargerLocation,
    float hourlyRate,
    float hostRating,
    int numberUsed,
    String identification,
){}
