package com.lopesweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lopesweb.course.entities.User;

@RestController
@RequestMapping(value = "/users" )
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L,"Maria","maria@gmail.con","9999-999","123456");
		return ResponseEntity.ok().body(u);
	}

}