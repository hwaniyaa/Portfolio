package com.espoir.espoir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espoir.espoir.dao.MemberDao;
import com.espoir.espoir.dto.MemberDto;


@Service
public class MemberServiceImpl implements MemberService {

  @Autowired
  MemberDao memberDao;

  @Override
  public int insertMember(MemberDto memberDto) {
    int result = memberDao.insertMember(memberDto);
    return result;
  }

  @Override
  public MemberDto loginMember(MemberDto memberDto) {
    MemberDto loginMemberDto = memberDao.loginMember(memberDto);
    return loginMemberDto;
  }

  
}
