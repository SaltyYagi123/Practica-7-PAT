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
public class ChargerTable {
    private @Column("USER_ID") @Id Long userId;
	private @Column("CHARGER_ID") Long carId;
	private @Column("CHARGER_NAME") int age;
	private @Column("LATITUDE") String carModel;
    private @Column("LONGITUDE") int carAge;
    private @Column("POWER") int carPower;
}