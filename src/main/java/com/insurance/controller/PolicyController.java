package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.insurance.entity.Policy;
import com.insurance.repository.PolicyRepository;
import com.insurance.service.PolicyService;

@RestController
@RequestMapping("/policies")
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    // Endpoint 5
    @GetMapping
    public ResponseEntity<Object> getAllPolicies() {
    	Map<String,Object> response=new LinkedHashMap<>();
    	response.put("success", true);
    	response.put("message", "placeholder for logic of retrieving all policies ");
        return ResponseEntity.ok(response);
    }

    // Endpoint 6
    @GetMapping("/type/{keyword}")
    public ResponseEntity<Object> getPoliciesByType(@PathVariable String keyword) {
    	Map<String,Object> response=new LinkedHashMap<>();
    	response.put("success", true);
    	response.put("message", "placeholder for logic of retrieving all policies using policy Type");
        return ResponseEntity.ok(response);
    }
}


