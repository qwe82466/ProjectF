package com.member.persistence;

import com.member.domain.AuthVO;
import com.member.domain.MemberVO;

public interface MemberMapper {

	// 회원 추가 
	public int addMember(MemberVO member);

	
}
