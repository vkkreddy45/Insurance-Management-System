package com.insurance.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.entity.Clients;
import com.insurance.service.ClientsService;


@RestController
@RequestMapping("/clients")
public class ClientsController {
	
    private final ClientsService clientService;
    
    public ClientsController(ClientsService clientService) {
    	this.clientService=clientService;
    }
	
	//Endpoint 1
	@PostMapping
    public ResponseEntity<Object> createClient() {
		Map<String,Object> response=new LinkedHashMap<>();
    	response.put("success", true);
    	response.put("message", "placeholder for logic of adding clinets ");
        return ResponseEntity.ok(response);
}
	
	// Endpoint 2
    @GetMapping
    public ResponseEntity<Object> getAllClients() {
       
    	Map<String,Object> response=new LinkedHashMap<>();
    	response.put("success", true);
    	response.put("message", "placeholder for logic of retrieving all clients ");
        return ResponseEntity.ok(response);
	
	
}
    
    //Endpoint 3
    @GetMapping("/{clientId}")
    public ResponseEntity<Object> getClientById(@PathVariable Long clientId) {
       
    	Map<String,Object> response=new LinkedHashMap<>();
    	response.put("success", true);
    	response.put("message", "placeholder for logic of retrieving client details using clientId ");
        return ResponseEntity.ok(response);
    }
    
    //Endpoint 4
    @PostMapping("/update/{clientId}")
    public ResponseEntity<Object> updateClient(@PathVariable Long clientId) {
    	Map<String,Object> response=new LinkedHashMap<>();
    	response.put("success", true);
    	response.put("message", "placeholder for logic of updating client details using clientId ");
        return ResponseEntity.ok(response);
    }

   

}

