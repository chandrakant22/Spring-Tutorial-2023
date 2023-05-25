package in.asterisc.Day12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/test")
	String myfun()
	{
		return "index.jsp";
	}

}
