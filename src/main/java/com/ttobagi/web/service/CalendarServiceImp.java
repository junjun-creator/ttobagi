package com.ttobagi.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttobagi.web.dao.CalendarDao;
import com.ttobagi.web.entity.Calendar;

@Service
public class CalendarServiceImp implements CalendarService {
	
	@Autowired
	CalendarDao calendarDao;
	
	@Override
	public List<Calendar> getList(int id) {
		// TODO Auto-generated method stub
		return calendarDao.getList(id);
	}

	@Override
	public int reg(Calendar c) {
		// TODO Auto-generated method stub
		return calendarDao.insert(c);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return calendarDao.delete(id);
	}

	@Override
	public int getLastId() {
		// TODO Auto-generated method stub
		return calendarDao.getLastId();
	}

	@Override
	public int update(Calendar c) {
		// TODO Auto-generated method stub
		return calendarDao.update(c);
	}

}
