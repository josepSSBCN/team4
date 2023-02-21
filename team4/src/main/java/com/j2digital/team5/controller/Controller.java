package com.j2digital.team5.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j2digital.team5.model.service.VuelingService;
import com.j2digital.team5.security.domain.Usuario;
import com.j2digital.team5.security.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {

	@Autowired
	VuelingService marketService;

	@Autowired
	UserService userService;
	

	@GetMapping("/getClientes")
	public List<Usuario> getClientes() {
		return userService.getClientes();
	}

	
}
