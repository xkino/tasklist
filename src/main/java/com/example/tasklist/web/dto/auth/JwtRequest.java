package com.example.tasklist.web.dto.auth;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class JwtRequest {
    @NotNull(message = "Username must not be null.")
    private String userName;

    @NotNull(message = "Password must not be null.")
    private String password;
}
