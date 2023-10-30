package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.PolicyRepository;

@Service
public class PolicyService {
	@Autowired
    private PolicyRepository policyRepository;

}

