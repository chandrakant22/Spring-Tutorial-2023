import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.Employee;

public class TestIOC {
	
	public static void main(String[] args) {
		Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee emp=(Employee)factory.getBean("e");  
        emp.show();  
        
        
	}

}
