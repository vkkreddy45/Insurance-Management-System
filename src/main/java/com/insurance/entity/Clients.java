package com.insurance.entity;

import javax.persistence.*;

@Entity
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    
    private String name;
    private String contactInformation;
    private String address;
    private String clientType; // Individual or Organization

    // Constructors
    

    

    // Getters
    
    // Setters
   
}

