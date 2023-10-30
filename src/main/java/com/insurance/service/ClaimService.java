package com.insurance.service;

import java.util.LinkedHashMap;
import java.time.LocalDate;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.insurance.entity.Claim;
import com.insurance.entity.ClientPolicy;
import com.insurance.entity.Clients;
import com.insurance.entity.Policy;
import com.insurance.repository.ClaimRespository;
import com.insurance.repository.ClientPolicyRepository;
import com.insurance.repository.ClientsRepository;
import com.insurance.repository.PolicyRepository;

@Service
public class ClaimService {
    private final ClientsRepository clientsRepository;
    private final PolicyRepository policyRepository;
    private final ClaimRespository claimRepository;
    private final ClientPolicyRepository clientPolicyRepository;

    @Autowired
    public ClaimService(ClientsRepository clientsRepository, PolicyRepository policyRepository, ClaimRespository claimRepository,ClientPolicyRepository clientPolicyRepository) {
        this.clientsRepository = clientsRepository;
        this.policyRepository = policyRepository;
        this.claimRepository = claimRepository;
        this.clientPolicyRepository=clientPolicyRepository;
    }

   
}
