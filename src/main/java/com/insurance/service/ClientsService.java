package com.insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.entity.Clients;
import com.insurance.repository.ClientsRepository;

@Service
public class ClientsService {
	
	@Autowired
    private ClientsRepository clientsRepository;

	

}