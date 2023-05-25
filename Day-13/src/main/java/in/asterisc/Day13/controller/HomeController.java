package in.asterisc.Day13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	String myfun()
	{
		return "index.jsp";
	}
}
