package com.insurance.controller;
import java.util.LinkedHashMap;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.insurance.entity.Claim;
import com.insurance.service.ClaimService;
@RestController
@RequestMapping("/claims")
public class ClaimController {
    @Autowired
    private ClaimService claimService;

    //Endpoint 9
    @PostMapping
    public ResponseEntity<Object> submitClaim() {
    	Map<String,Object> response=new LinkedHashMap<>();
    	response.put("success", true);
    	response.put("message", "placeholder for logic of claim for policy by client");
        return ResponseEntity.ok(response);
    }
}

