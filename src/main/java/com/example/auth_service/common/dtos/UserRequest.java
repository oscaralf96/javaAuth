package com.example.auth_service.common.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotNull
    private String email;
    @NotNull
    private String password;
}
