package in.asterisc.Day02;

public class BusinessLogic {
	
	public void m()
	{
		System.out.println("actual business logic");
	} 
	
	
	public void m(int age)
	{
		   if(age<18){  
	            throw new ArithmeticException("Not Valid Age");  
	        }  
	        else{  
	            System.out.println("vote confirmed");  
	        }  
		   
		   System.out.println("actual business logic");
	} 
}
