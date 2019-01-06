package io.javabrains.springframebootwork.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
	
	@RequestMapping("/hi")
	public  String Hello() {
		return "Hiiii";
	}
	

}
