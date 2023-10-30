package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

//import com.insurance.entity.ClientPolicy;
import com.insurance.service.ClientPolicyService;


@RestController
@RequestMapping("/client-policy")
public class ClientPolicyController {

    private final ClientPolicyService clientPolicyService;

    @Autowired
    public ClientPolicyController(ClientPolicyService clientPolicyService) {
        this.clientPolicyService = clientPolicyService;
    }

    //Endpoint 7
    @PostMapping("/add-policy-to-client")
    public ResponseEntity<Object> addPolicyToClient() {
    	Map<String,Object> response=new LinkedHashMap<>();
    	response.put("success", true);
    	response.put("message", "placeholder for adding policy for client");
        return ResponseEntity.ok(response);
    }


    // Endpoint 8
    @GetMapping("/policies-by-client/{clientId}")
    public ResponseEntity<Object> getPoliciesByClient(@PathVariable Long clientId) {
    	Map<String,Object> response=new LinkedHashMap<>();
    	response.put("success", true);
    	response.put("message", "placeholder for logic of retrieving all policies associated with clientId ");
        return ResponseEntity.ok(response);
    }
}
