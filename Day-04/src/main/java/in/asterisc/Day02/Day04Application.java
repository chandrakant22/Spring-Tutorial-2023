package in.asterisc.Day02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class Day04Application {

	public static void main(String[] args) {

		// Resource r=new ClassPathResource("applicationContext.xml");
		// BeanFactory factory=new XmlBeanFactory(r);

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BusinessLogic bl = (BusinessLogic) context.getBean("proxy");
		bl.m(12);

	}

}


/*
 * 
 * 
 * 
public void m1(){
log();

...
notify();
}  
public void m2(){
log();

...
notify();
}  
public void m3(){
log();

...
notify();
}  
public void m4(){

...

}  
public void m5(){
...
}  
public void n1(){

...
}  
public void n2(){
...
}  
public void p1(){
...
}  
public void p2(){
...
}  
public void p3(){
...
} 




void log()
{

//code

}


void notify()
{

//code

}


There are 5 methods that starts from m, 2 methods that starts from n and 3 methods that starts from p.

Understanding Scenario I have to maintain log and send notification after calling methods that starts from m.

Problem without AOP We can call methods (that maintains log and sends notification) from the methods starting with m. In such scenario, we need to write the code in all the 5 methods.

But, if client says in future, I don't have to send notification, you need to change all the methods. It leads to the maintenance problem.

Solution with AOP We don't have to call methods from the method. Now we can define the additional concern like maintaining log, sending notification etc. in the method of a class. Its entry is given in the xml file.

In future, if client says to remove the notifier functionality, we need to change only in the xml file. So, maintenance is easy in AOP.
 */
