package com.educandoWeb.course.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoWeb.course.entities.User;

@RestController
@RequestMapping(value = "/Users" )
public class UserResourse {
	
	@GetMapping
	public ResponseEntity <User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);
		
	}

}
