package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.student;

@RestController
@RquestMappint("student")
public class studentcontroller {
	
	@Autowired
	StudentServices studentservice;
	
	
 @GetMapping("/student")
	public String index() {
		return"hello";
	}
 @PostMapping("/store")
 public student saveStudent(@RequestBody student student) {
	 return  studentservice.create(student);
}
}