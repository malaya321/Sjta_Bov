package com.sjta.bov.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String userId; // e.g., SJTA-DRV-001

    private String name;

    @Column(unique = true)
    private String mobileNumber;

    private String password; // For Admin/Supervisor Web Login

    @Enumerated(EnumType.STRING)
    private Role role; // ADMIN, SUPERVISOR, DRIVER

    @Column(columnDefinition = "TEXT")
    private String faceTemplate; // Biometric data for Drivers

    private String assignedZone; // For Supervisors

    private boolean active = true;

    private LocalDateTime createdAt = LocalDateTime.now();
}