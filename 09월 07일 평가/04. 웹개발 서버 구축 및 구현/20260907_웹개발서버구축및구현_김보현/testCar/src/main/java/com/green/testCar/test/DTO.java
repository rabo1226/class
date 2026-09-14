package com.green.testCar.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DTO {
  //메인 페이지
  @GetMapping("/")
  public String main(){
    return "/pages/main";
  }

  //로그인 클릭
  @GetMapping("/login-form")
  public String loginForm(){
    return "pages/login-form";
  }

  //로그인 버튼 클릭 시
  //1) 중복확인 결과 != null -> 회워 아이디
  @GetMapping("/check-member")
  public boolean checkMember(DTO dto){

  }

}
