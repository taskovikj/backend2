package com.dians.secondhwfinal.services;


import com.dians.secondhwfinal.model.GasStation;
import com.dians.secondhwfinal.repository.GasStationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GasStationService {
    private final GasStationRepo gasStationRepo;

    public GasStationService(GasStationRepo gasStationRepo) {
        this.gasStationRepo = gasStationRepo;
    }
    public List<GasStation> getAllGasStations(){
        return gasStationRepo.findAll();
    }
}
