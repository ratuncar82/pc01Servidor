package gob.pe.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hola/server")
public class HolaResource {
	
	
	@GetMapping
	public String hola() {
		return "Hola CJAVA desde el servidor";
	}
}