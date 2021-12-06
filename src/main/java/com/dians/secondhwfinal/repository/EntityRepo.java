package com.dians.secondhwfinal.repository;

import com.dians.secondhwfinal.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepo extends JpaRepository<Bank,Long> {
}
