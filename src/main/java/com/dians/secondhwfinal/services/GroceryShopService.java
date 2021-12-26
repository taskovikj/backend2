package com.dians.secondhwfinal.services;


import com.dians.secondhwfinal.model.GroceryShop;
import com.dians.secondhwfinal.repository.GroceryShopRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryShopService {
    private final GroceryShopRepo groceryShopRepo;

    public GroceryShopService(GroceryShopRepo groceryShopRepo) {
        this.groceryShopRepo = groceryShopRepo;
    }

    public List<GroceryShop> getAllGroceryShops(){
        return groceryShopRepo.findAll();
    }
}
