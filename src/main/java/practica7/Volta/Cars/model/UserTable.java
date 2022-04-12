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
@Table("USERS")
public class UserTable {
    private @Column("USER_ID") @Id Long userId;
	private @Column("CAR_ID") Long carId;
	private @Column("AGE") int age;
	private @Column("COUNTRY") String country;
    private @Column("IDENTIFICATION") String identification;
}
