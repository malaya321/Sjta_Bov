package com.sjta.bov.dto;

import com.sjta.bov.entity.Role;
import lombok.Data;

@Data
public class UserRegistrationDTO {
    private String userId;
    private String name;
    private String mobileNumber;
    private String password;
    private Role role;
    private String faceTemplate; // Sent by mobile app during driver registration
    private String assignedZone;
}