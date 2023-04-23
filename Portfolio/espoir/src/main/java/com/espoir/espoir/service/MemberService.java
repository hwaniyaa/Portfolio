package com.espoir.espoir.service;

import com.espoir.espoir.dto.MemberDto;

public interface MemberService {
  public int insertMember(MemberDto memberDto);
  public MemberDto loginMember(MemberDto memberDto);
}
