package com.bankapp.demo.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bankapp.demo.dto.BankResponse;
import com.bankapp.demo.dto.CreditDebitRequest;
import com.bankapp.demo.dto.EnquiryRequest;
import com.bankapp.demo.dto.UserRequest;
import com.bankapp.demo.service.impl.UserService;

@RestController
@RequestMapping("api/user")

public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping
	public BankResponse createAccount(@RequestBody UserRequest userRequest) {
		return userService.createAccount(userRequest);
	}
	
	@GetMapping("balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return userService.balanceEnquiry(request);
    }

    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){
        return userService.nameEnquiry(request);
    }
    @PostMapping("credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userService.creditAccount(request);
    }
    
    @PostMapping("debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userService.debitAccount(request);
    }
	


}


