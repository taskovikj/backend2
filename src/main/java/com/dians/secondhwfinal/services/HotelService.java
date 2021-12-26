package com.dians.secondhwfinal.services;


import com.dians.secondhwfinal.model.Hotel;
import com.dians.secondhwfinal.repository.HotelRepo;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    private final HotelRepo hotelRepo;

    public HotelService(HotelRepo hotelRepo) {
        this.hotelRepo = hotelRepo;
    }

    public List<Hotel> getAllHotels(){
        return hotelRepo.findAll();
    }
}
