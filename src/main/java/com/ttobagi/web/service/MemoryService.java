package com.ttobagi.web.service;

import java.util.List;

import com.ttobagi.web.entity.Memory;

public interface MemoryService {

	List<Memory> getList(int id);
	
	int insert(String content, String saveFileName, int cId);

	int delete(int cardId);
	
}
