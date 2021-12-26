package com.dians.secondhwfinal.repository;

import com.dians.secondhwfinal.model.Bank;
import com.dians.secondhwfinal.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel,Long> {
}
