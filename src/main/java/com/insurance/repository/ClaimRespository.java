package com.insurance.repository;


import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.insurance.entity.Claim;


@Repository
public interface ClaimRespository extends JpaRepository<Claim, Long> {

	

	
    // You can define custom query methods here if needed

}

