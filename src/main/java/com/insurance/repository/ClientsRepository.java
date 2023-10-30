package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.entity.Clients;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long> {

	
    // You can define custom query methods here if needed
}
