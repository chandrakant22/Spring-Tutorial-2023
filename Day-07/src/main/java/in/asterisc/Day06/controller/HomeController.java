package in.asterisc.Day06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HomeController {
	
	
	@RequestMapping("/test") //url
	@ResponseBody
	String fun()
	{
		return "hello Spring";
	}
	
	
	@RequestMapping("/home") //url
	String fun2()
	{
		//return "view/index.jsp";
		return "index";
	}
	

}
