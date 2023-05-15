package in.asterisc.Day06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.asterisc.Day06.model.Student;

@Controller
public class HomeController {
	
	
	@RequestMapping("/test")
	String fun(Model model)
	{
		String name="Geeta";
		model.addAttribute("uname",name);
		return "index.jsp";
	}

	
	
	@RequestMapping("/test1")
	String fun1(Model model)
	{
		String roll="101";
		String name="Geeta";
		String address="nagpur";
		model.addAttribute("uid",roll);
		model.addAttribute("uname",name);
		model.addAttribute("uadd",address);
		return "index.jsp";
	}

	@RequestMapping("/test2")
	String fun2(Model model)
	{
		Student s=new Student(101, "ram", "pune");
		model.addAttribute("stud",s);
		return "index.jsp";
	}
	
	@RequestMapping("/test3")
	ModelAndView fun3()
	{
		ModelAndView model=new ModelAndView("index.jsp");
		Student s=new Student(102, "sham", "pune");
		model.addObject("stud",s);
		return model;
	}
	
}
