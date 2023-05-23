package in.asterisc.Day11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.asterisc.Day11.model.Product;
import in.asterisc.Day11.service.ProductServiceImplementation;

@RestController
public class HomeController {
	@Autowired  
	private ProductServiceImplementation productService;  
	
	@GetMapping(value = "/")  
	public List<Product> getProduct()   
	{  
	  
	List<Product> products = productService.findAll();  

	return products;  
	}  

}
