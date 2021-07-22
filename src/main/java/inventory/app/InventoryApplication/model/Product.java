package inventory.app.InventoryApplication.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
@Table
public class Product {
	
	@Id
	@SequenceGenerator(
			name = "product_sequence",
			sequenceName = "product_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "product_sequence"
	)
	private String id;
	
	private String name;
	private LocalDate expiredDate;
	private BigDecimal price;
}
