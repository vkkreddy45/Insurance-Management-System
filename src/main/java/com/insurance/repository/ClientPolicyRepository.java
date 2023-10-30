package com.insurance.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.entity.ClientPolicy;
import com.insurance.entity.Clients;
import com.insurance.entity.Policy;


@Repository
public interface ClientPolicyRepository extends JpaRepository<ClientPolicy, Long> {

    // You can define custom query methods here if needed


	
}