package com.dians.secondhwfinal;


import com.dians.secondhwfinal.model.Bank;
import com.dians.secondhwfinal.services.BankService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/banks")
public class BankResorce {
    private final BankService bankService;

    public BankResorce(BankService bankService) {
        this.bankService = bankService;
    }
    @GetMapping
    public ResponseEntity<List<Bank>> getAllBanks(){
        List<Bank> banks = bankService.getAllBanks();
        return new ResponseEntity<>(banks, HttpStatus.OK);
    }
}
