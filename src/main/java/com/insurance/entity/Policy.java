package com.insurance.entity;


import javax.persistence.*;

@Entity
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long policyId;
    
    private String policyType;
    private double coverageAmount;
    private int coolingPeriod; // Represents the number of years 
    private int durationUntill;//Represents the number of years 

    // Constructors
    

    // Getters and setters
   

    
}
