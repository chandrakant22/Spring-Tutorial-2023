package in.asterisc.Day02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Day05Application {
    //Spring AOP using Annotation
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BusinessLogic bl = (BusinessLogic) context.getBean("obj");
		bl.m();
		bl.msg();
		bl.k();
		
		
		
		
		
	}

}
