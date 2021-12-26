package com.dians.secondhwfinal.services;

import com.dians.secondhwfinal.model.Beach;
import com.dians.secondhwfinal.repository.BeachRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeachService {
    private final BeachRepo beachRepo;

    @Autowired
    public BeachService(BeachRepo beachRepo) {
        this.beachRepo = beachRepo;
    }

    public List<Beach> getAllBeaches(){
        return beachRepo.findAll();
    }

}
