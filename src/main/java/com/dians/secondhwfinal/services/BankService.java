package com.dians.secondhwfinal.services;

import com.dians.secondhwfinal.model.Bank;
import com.dians.secondhwfinal.repository.EntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    private final EntityRepo entityRepo;

    @Autowired
    public BankService(EntityRepo entityRepo) {
        this.entityRepo = entityRepo;
    }
    public List<Bank> getAllBanks(){
        return entityRepo.findAll();
    }
}
