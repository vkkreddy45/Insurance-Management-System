package com.insurance.entity;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long claimId;
    
    private Long clientId;
    private Long policyId;
    private LocalDate dateOfLoss;
    private String descriptionOfLoss;
    private double claimAmount;
    private String claimStatus;
    private String claimAdjusterNotes;
    private LocalDate claimDate;
    private LocalDate approvalDate;
    
    // Constructors
   

    // Getters and setters
   
}
