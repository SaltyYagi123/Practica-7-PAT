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
@Table("VEHICLES")
public class ECar {
    private @Column("USER_ID") @Id Long userId;
	private @Column("CAR_ID") Long carId;
	private @Column("ELECTROC") int age;
	private @Column("MODEL") String carModel;
    private @Column("VEHICLE AGE") int carAge;
}
