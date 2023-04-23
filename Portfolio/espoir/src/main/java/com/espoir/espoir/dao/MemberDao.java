package com.espoir.espoir.dao;

import org.apache.ibatis.annotations.Mapper;

import com.espoir.espoir.dto.MemberDto;

@Mapper
public interface MemberDao {
  int insertMember(MemberDto memberDto);
  MemberDto loginMember(MemberDto memberDto);
}
