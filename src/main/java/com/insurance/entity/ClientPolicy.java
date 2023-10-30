package com.insurance.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class ClientPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "clientId")
    private Clients client;

    @ManyToOne
    @JoinColumn(name = "policy_id", referencedColumnName = "policyId")
    private Policy policy;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDate createdAt;

    private LocalDate claimFrom; // Date when the claim coverage starts
    private LocalDate claimTill; // Date when the claim coverage ends

    // Constructors
   

    // Getters and setters
    
}

