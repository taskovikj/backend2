package com.dians.secondhwfinal.repository;

import com.dians.secondhwfinal.model.Bank;
import com.dians.secondhwfinal.model.GroceryShop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryShopRepo extends JpaRepository<GroceryShop,Long> {
}
