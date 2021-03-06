package practica7.Volta.Cars.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("CHARGERS")
public class Charger {
    private @Column("USER_ID") @Id int userId;
	private @Column("CHARGER_ID") int carId;
	private @Column("CHARGER_NAME") int age;
	private @Column("LATITUDE") float latitude;
    private @Column("LONGITUDE") float longitude;
    private @Column("POWER") int carPower;
}