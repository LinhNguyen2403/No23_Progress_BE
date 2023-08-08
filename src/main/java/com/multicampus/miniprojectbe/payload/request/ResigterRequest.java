package com.multicampus.miniprojectbe.payload.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResigterRequest {
    private String username;
    private String email;
    private String password;
    private Set<String> role;
}
