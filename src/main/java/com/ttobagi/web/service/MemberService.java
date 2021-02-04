package com.ttobagi.web.service;

import java.util.List;

import com.ttobagi.web.entity.CoupleView;
import com.ttobagi.web.entity.Member;
import com.ttobagi.web.entity.MemberView;

public interface MemberService {

	Member getMemberByPhone(String phone);

	Member getMemberByLoginId(String loginId);

	Member get(int id);

	int update(Member member);

	List<MemberView> getList(int offset, int size, String search);

}
