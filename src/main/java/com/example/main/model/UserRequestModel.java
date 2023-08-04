package com.example.main.model;

import com.example.main.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserRequestModel
{
    @NotNull(message = "firstname shouldn't be null")
    private  String firstname;
    @NotNull(message = "lastname shouldn't be null")
    private  String lastname;
    @Email(message = "invalid email address")
    private  String email;
    @Min(6)
    private  String password;
    @NotBlank
    private  String address;
    @NotBlank
    private Role role;
}