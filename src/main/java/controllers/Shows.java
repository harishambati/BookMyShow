package controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Shows {

	
	@GetMapping
	public List<Shows> getShow(){
		return null;
		
	}
	
}
