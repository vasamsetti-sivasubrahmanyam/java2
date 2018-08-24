package com.cg.session.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.session.beans.ScheduledSessions;
import com.cg.session.exception.InvalidInputException;
import com.cg.session.service.SchedulerService;


@Controller
public class URIController {
	@Autowired(required=true)
	SchedulerService service;
	@RequestMapping("/")
	public ModelAndView getIndexPage() throws SQLException{
		
		List<ScheduledSessions> list;
		try {
			// This will all  get details of Scheduled Sessions
			list = service.getdetails();
		ModelAndView modelAndView = new ModelAndView("schedulersessions", "schedule", list);
		// This will returning to Scheduler Session page after user clicking schedulersession page
		return modelAndView;
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Otherwise this will returning to error Page and the user will see Where he Committed Wrong
		return new ModelAndView("errorPage");
	}
	
	@RequestMapping(value="/enroll/{id}",method=RequestMethod.GET)
	public ModelAndView getEnroll(@PathVariable int id) throws SQLException{
				
					
					try {
						ScheduledSessions schedule = service.getOnedetail(id);//to get details
						ModelAndView modelAndView = new ModelAndView("success", "schedule", schedule);
						// This will returning to success page After User Clicking Success Page
						return modelAndView;
					} catch (InvalidInputException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				return new ModelAndView("errorPage");
					
				}
	@ModelAttribute("schedule")
	public ScheduledSessions getCourse() {
	return new ScheduledSessions();
}
}
