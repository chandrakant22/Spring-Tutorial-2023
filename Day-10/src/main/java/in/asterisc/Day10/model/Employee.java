package in.asterisc.Day10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
/*@Setter
@Getter
@NoArgsConstructor*/
@Entity
@Table(name = "emp_tbl")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name",nullable =false)
	private String name;
	@Column(name = "address",nullable =false)
	private String address;
	

}
