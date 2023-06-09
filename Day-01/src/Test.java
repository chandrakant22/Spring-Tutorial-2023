import model.Address;
import model.Employee;

// IOC (Inversion Of Control) and Dependency Injection

public class Test {

	public static void main(String[] args) {
		
      Address add=new Address(151, "nagpur", "maha", 440013);
      
      Employee emp1=new Employee(101, "Ram", add);
      Employee emp2=new Employee(102, "Geeta", add);
      
      emp1.show();
      emp2.show();	
      
		
	}

}



/*
Spring is a lightweight framework.
and called as framework of frameworks

Frameworks include => Struts, Hibernate, Tapestry, EJB, JSF, etc.

Spring basic Modules => IOC, AOP, DAO, Context, ORM, WEB MVC etc.

*/