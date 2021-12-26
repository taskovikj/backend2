package com.dians.secondhwfinal.repository;

import com.dians.secondhwfinal.model.Bank;
import com.dians.secondhwfinal.model.Restaurants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<Restaurants,Long> {
}
