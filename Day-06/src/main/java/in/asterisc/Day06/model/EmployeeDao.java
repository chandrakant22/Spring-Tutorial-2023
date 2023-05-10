package in.asterisc.Day06.model;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {
	HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	//method to save employee 
	public void saveEmp(Employee e)
	{
		template.save(e);
	}

}
