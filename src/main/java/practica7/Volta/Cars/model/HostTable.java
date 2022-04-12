package practica7.Volta.Cars.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("HOSTS")
public class HostTable {
    private @Column("USER_ID") @Id Long userId;
    private @Column("CAR_ID") int carId;
    private @Column("CHARGER_LOCATION") String chargerLocation;
    private @Column("HOURLY_RATE") float hourlyRate;
    private @Column("RATING") float hostRating;
    private @Column("NUMBER_USED") int numberUsed;
    private @Column("IDENTIFICATION") String identification;
}
