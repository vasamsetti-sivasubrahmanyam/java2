package com.cg.session.service;

import java.util.List;

import com.cg.session.beans.ScheduledSessions;
import com.cg.session.exception.InvalidInputException;



public interface SchedulerService {
	public List<ScheduledSessions> getdetails() throws InvalidInputException;
	public ScheduledSessions getOnedetail(int id)throws InvalidInputException;
}
