package com.ttobagi.web.service;

import com.ttobagi.web.entity.Member;

public interface AuthService {

	int insert(Member member); 				// member 테이블에 회원정보 insert
	int insertMemberRole(int memberId, int roleId);			// memberRole 테이블에 memberId insert

	int checkLoginId(String loginId);

	int checkNickname(String nickname);

	int getLastId();

	
}
