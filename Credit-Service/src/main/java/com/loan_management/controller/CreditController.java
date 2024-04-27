package com.loan_management.controller;

import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/credit")
public class CreditController {

  @GetMapping("/hello")
  public Boolean delete(){
    return true;
  }


}
