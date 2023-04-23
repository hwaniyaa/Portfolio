package com.espoir.espoir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String main(){
    return "/main/index";
  }
  
  
  @GetMapping("/layout")
  public String layout(){
    return "/layout/layout";
  }
}
