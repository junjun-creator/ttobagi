package com.ttobagi.web.service;

import java.util.List;

import com.ttobagi.web.entity.Calendar;

public interface CalendarService {
	List<Calendar> getList(int id);

	int reg(Calendar c);

	int delete(int id);

	int getLastId();

	int update(Calendar c);

}
