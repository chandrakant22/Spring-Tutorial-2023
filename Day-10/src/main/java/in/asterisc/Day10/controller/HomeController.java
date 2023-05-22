package in.asterisc.Day10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.asterisc.Day10.model.Employee;
import in.asterisc.Day10.repository.EmplyeeRepository;

@Controller
public class HomeController {
	@Autowired
	EmplyeeRepository db;
	
	@RequestMapping("/")
	String myfun(Model m)
	{
		Employee e=new Employee();
		m.addAttribute("emp", e);
		return "reg";
	}
	
	@RequestMapping("/register")
	@ResponseBody
	String myfun1(@ModelAttribute("emp") Employee e)
	{
	   System.out.println("Data "+e.toString());
	    db.save(e);
		return "Data Inserted";
	}
}
