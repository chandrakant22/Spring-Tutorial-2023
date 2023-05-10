package in.asterisc.Day06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.asterisc.Day06.model.Employee;
import in.asterisc.Day06.model.EmployeeDao;


//Hibernate and Spring Integration  
@SpringBootApplication
public class Day06Application {

	public static void main(String[] args) {
		SpringApplication.run(Day06Application.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) context.getBean("d");

		Employee e = new Employee();
		e.setId(101);
		e.setName("ram");
		e.setSalary(50000);

		dao.saveEmp(e);
		
		System.out.println("Data inserted !");
	}

}
