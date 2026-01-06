package com.sjta.bov.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String userId;
    private String faceTemplate;
}