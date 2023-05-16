package in.asterisc.Day09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import in.asterisc.Day09.model.Student;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	String fun()
	{
		return "page.html";
	}
	
	@RequestMapping("/reg")
	String fun1(Model m)
	{
		Student st=new Student();
		m.addAttribute("stud",st);
		System.out.println("Page A : "+st);
		return "pageA.html";
	}
	
	@RequestMapping("/show")
	String fun2(@ModelAttribute("stud") Student sr,Model m)
	{
		System.out.println("Page B : "+sr);
		m.addAttribute("stud", sr);
		
		return "pageB.html";
	}
}
