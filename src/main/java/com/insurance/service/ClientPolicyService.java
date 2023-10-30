package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.insurance.entity.ClientPolicy;
import com.insurance.entity.Clients;
import com.insurance.entity.Policy;
import com.insurance.repository.ClientPolicyRepository;
import com.insurance.repository.ClientsRepository;
import com.insurance.repository.PolicyRepository;

@Service
public class ClientPolicyService {

    private final ClientsRepository clientsRepository;
    private final PolicyRepository policyRepository;
    private final ClientPolicyRepository clientPolicyRepository;

    @Autowired
    public ClientPolicyService(ClientsRepository clientsRepository, PolicyRepository policyRepository, ClientPolicyRepository clientPolicyRepository) {
        this.clientsRepository = clientsRepository;
        this.policyRepository = policyRepository;
        this.clientPolicyRepository = clientPolicyRepository;
    }

   
}
