package com.vueling.team4.model.service;

import com.vueling.team4.model.domain.Costs;
import com.vueling.team4.model.domain.Schedule;
import com.vueling.team4.model.domain.Shifts;
import com.vueling.team4.model.repository.CostsRepo;
import com.vueling.team4.model.repository.ScheduleRepo;
import com.vueling.team4.model.repository.ShiftsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VuelingService {
	@Autowired
	ScheduleRepo scheduleRepo;

	@Autowired
	CostsRepo costsRepo;

	@Autowired
	ShiftsRepo shiftsRepo;

	public Schedule getSchelude(){
		return scheduleRepo.findAll().get(0);
	}

	public List<Costs> getCosts(){
		return  costsRepo.findAll();
	}

	public List<Shifts> getShifts(){return shiftsRepo.findAll();}
}
