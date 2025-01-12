package com.testproject.kye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testproject.kye.dto.RegistrationRequest;
import com.testproject.kye.service.UserService;

import jakarta.validation.Valid;
//this is the controller
// but this project is not going on now 
@RestController
@RequestMapping("/api")
public class EmpController {
	@Autowired
	UserService userService;

	@PutMapping("/register")
	public ResponseEntity<String> registerEmployee(@RequestBody @Valid RegistrationRequest registrationRequest) {
		userService.registerEmployee(registrationRequest);
		
		return new ResponseEntity<>(" User created Successfully...!", HttpStatus.CREATED);

	}

}
 