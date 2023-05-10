package in.asterisc.Day06.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_tbl")
public class Employee {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  private String name;
  
  private String salary;
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
  
  
}
