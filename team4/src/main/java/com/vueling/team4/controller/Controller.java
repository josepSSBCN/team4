package com.vueling.team4.controller;


import java.util.List;

import com.vueling.team4.model.domain.Costs;
import com.vueling.team4.model.domain.Schedule;
import com.vueling.team4.model.domain.Shifts;
import com.vueling.team4.model.service.VuelingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vueling.team4.security.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {

	@Autowired
	VuelingService vuelingService;

	@Autowired
	UserService userService;
	

	@GetMapping("/getSchelude")
	public Schedule getSchelude() {
		return vuelingService.getSchelude();
	}

	@GetMapping("/getCosts")
	public List<Costs> getCosts() {
		return vuelingService.getCosts();
	}

	@GetMapping("/getShifts")
	public List<Shifts> getShifts() {
		return vuelingService.getShifts();
	}




}
