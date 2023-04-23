package com.espoir.espoir.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.espoir.espoir.dto.MemberDto;
import com.espoir.espoir.service.MemberService;
import com.espoir.espoir.utils.ScriptWriter;


@Controller
@RequestMapping("/main")
@SessionAttributes("session")
public class MemberController {

  @Autowired
  MemberService memberService;

  // 회원가입
  @PostMapping("/joinProcess")
  public String joinProcess(
    MemberDto memberDto, 
    RedirectAttributes redirectAttributes,
    HttpServletResponse response
    ) throws IOException {
    int result = memberService.insertMember(memberDto);
    if(result > 0){
      redirectAttributes.addFlashAttribute("msg", "회원가입이 완료되었습니다.");
      return "redirect:/";
    } else {
      ScriptWriter.alertAndBack(response, "다시 시도해 주세요.");
      return null;
    }
  }

  // 로그인
  @PostMapping("/loginProcess")
  public String loginProcess(
    MemberDto memberDto,
    RedirectAttributes redirectAttributes,
    HttpServletRequest request
  ){
    HttpSession session = request.getSession();
    redirectAttributes.addFlashAttribute("msg", "로그인 되었습니다.");
    MemberDto loggedMember = memberService.loginMember(memberDto);
    session.setAttribute("loggedMember", loggedMember);
    return "redirect:/";
  }

  // 로그아웃
  @GetMapping("/logout")
  public String logout(
    HttpSession session,
    RedirectAttributes redirectAttributes
  ) {
    session.invalidate();
    redirectAttributes.addFlashAttribute("msg", "로그아웃되었습니다.");
    return "redirect:/";
  }

  @GetMapping("/mypage")
  public String mypage(){
    return "/main/mypage";
  }
}
