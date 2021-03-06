package com.ttobagi.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ttobagi.web.entity.Calendar;

@Repository
public class CalendarDaoImp implements CalendarDao {

	private SqlSession session;
	private CalendarDao mapper;
	
	@Autowired
	public CalendarDaoImp(SqlSession session) {
		this.session = session;
		mapper = session.getMapper(CalendarDao.class);
	}
	
	@Override
	public List<Calendar> getList(int id) {
		// TODO Auto-generated method stub
		return mapper.getList(id);
	}

	@Override
	public int insert(Calendar c) {
		// TODO Auto-generated method stub
		return mapper.insert(c);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return mapper.delete(id);
	}

	@Override
	public int getLastId() {
		// TODO Auto-generated method stub
		return mapper.getLastId();
	}

	@Override
	public int update(Calendar c) {
		// TODO Auto-generated method stub
		return mapper.update(c);
	}

}
