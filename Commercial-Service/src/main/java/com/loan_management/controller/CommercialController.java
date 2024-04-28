package com.loan_management.controller;

import com.loan_management.kafkaConfig.MessageProducer;
import com.loan_management.service.CommercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/commercial")
public class CommercialController {

  @Autowired
  private MessageProducer messageProducer;
  @Autowired
  private CommercialService commercialService;



  @GetMapping("/hello")
  public Boolean delete(){
    return true;
  }





  @PostMapping("/apply/{id_client}/{amount}")
  public ResponseEntity applyForLoan(@PathVariable("id_client") String id_client ,@PathVariable("amount") double amount) {
    try {
      double approval = commercialService.processLoanApplication(amount,id_client);
      messageProducer.sendMessage("management-queue-input",id_client,String.valueOf(approval));

      return ResponseEntity.ok(approval);
    } catch (IllegalArgumentException e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
  }
}

