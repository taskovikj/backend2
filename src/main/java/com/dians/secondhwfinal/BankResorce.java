package com.dians.secondhwfinal;
import com.dians.secondhwfinal.model.*;
import com.dians.secondhwfinal.services.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class BankResorce {
    private final BankService bankService;
    private final BeachService beachService;
    private final GroceryShopService groceryShopService;
    private final HotelService hotelService;
    private final GasStationService gasStationService;
    private final RestauratService restauratService;

    public BankResorce(BankService bankService, BeachService beachService, GroceryShopService groceryShopService, HotelService hotelService, GasStationService gasStationService, RestauratService restauratService) {
        this.bankService = bankService;
        this.beachService = beachService;
        this.groceryShopService = groceryShopService;
        this.hotelService = hotelService;
        this.gasStationService = gasStationService;
        this.restauratService = restauratService;
    }
    @GetMapping("/banks")
    public ResponseEntity<List<Bank>> getAllBanks(){
        List<Bank> banks = bankService.getAllBanks();
        return new ResponseEntity<>(banks, HttpStatus.OK);
    }

    @GetMapping("/beaches")
    public ResponseEntity<List<Beach>> getAllBeaches(){
        List<Beach> beaches = beachService.getAllBeaches();
        return new ResponseEntity<>(beaches, HttpStatus.OK);
    }

    @GetMapping("/gas-stations")
    public ResponseEntity<List<GasStation>> getAllStations(){
        List<GasStation> stations = gasStationService.getAllGasStations();
        return new ResponseEntity<>(stations, HttpStatus.OK);
    }

    @GetMapping("/grocery")
    public ResponseEntity<List<GroceryShop>> getAllShops(){
        List<GroceryShop> shops = groceryShopService.getAllGroceryShops();
        return new ResponseEntity<>(shops,HttpStatus.OK);
    }
    @GetMapping("/hotels")
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> hotels = hotelService.getAllHotels();
        return new ResponseEntity<>(hotels,HttpStatus.OK);
    }
    @GetMapping("/restaurants")
    public ResponseEntity<List<Restaurants>> getAllRestaurants(){
        List<Restaurants> restaurants = restauratService.getAllRestaurants();
        return new ResponseEntity<>(restaurants,HttpStatus.OK);

    }



}
