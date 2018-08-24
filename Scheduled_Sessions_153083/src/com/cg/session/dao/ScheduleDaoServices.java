package com.cg.session.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.session.beans.ScheduledSessions;
//Dao Layer
public interface ScheduleDaoServices extends JpaRepository<ScheduledSessions,Integer>{

}
