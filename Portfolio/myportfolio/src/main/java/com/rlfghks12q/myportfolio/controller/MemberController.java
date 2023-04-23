package com.rlfghks12q.myportfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MemberController {
  
  @GetMapping("/main")
  public String main(){
    return "/member/main";
  }
  @GetMapping("/about")
  public String about(){
    return "/member/about";
  }
  @GetMapping("/skills")
  public String skills(){
    return "/member/skills";
  }
  @GetMapping("/portfolio")
  public String portfolio(){
    return "/member/portfolio";
  }
}
