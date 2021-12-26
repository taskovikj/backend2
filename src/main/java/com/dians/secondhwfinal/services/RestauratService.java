package com.dians.secondhwfinal.services;


import com.dians.secondhwfinal.model.Restaurants;
import com.dians.secondhwfinal.repository.RestaurantRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauratService {

    private final RestaurantRepo restaurantRepo;

    public RestauratService(RestaurantRepo restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }

    public List<Restaurants> getAllRestaurants(){
        return restaurantRepo.findAll();
    }
}
