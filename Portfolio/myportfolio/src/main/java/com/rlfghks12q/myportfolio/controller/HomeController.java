package com.rlfghks12q.myportfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  
  @GetMapping("/")
  public String myPage(){
    return "/member/myPage";
  }

}
