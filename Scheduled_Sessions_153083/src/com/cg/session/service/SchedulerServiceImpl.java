package com.cg.session.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.cg.session.beans.ScheduledSessions;
import com.cg.session.dao.ScheduleDaoServices;
import com.cg.session.exception.InvalidInputException;



@Component(value="schedulerservices")
public class SchedulerServiceImpl implements SchedulerService {

	@Autowired
	private ScheduleDaoServices daoServices;
	@Transactional
	@Override
	public List<ScheduledSessions> getdetails() throws InvalidInputException {
		List<ScheduledSessions> clist= daoServices.findAll();//finding details from dao layer
		return clist;
	}
	@Transactional
	@Override
	// This will find  course details based on Trainee Id
	public ScheduledSessions getOnedetail(int id) throws InvalidInputException {
		// TODO Auto-generated method stub
		return daoServices.findOne(id);
	}

	

	
}
