package com.bankapp.demo.service.impl;

import com.bankapp.demo.dto.BankResponse;
import com.bankapp.demo.dto.CreditDebitRequest;
import com.bankapp.demo.dto.EnquiryRequest;
import com.bankapp.demo.dto.UserRequest;

public interface UserService {

	BankResponse createAccount(UserRequest userRequest);
	
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);

}
