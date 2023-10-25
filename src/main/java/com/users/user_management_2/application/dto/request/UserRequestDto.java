package com.users.user_management_2.application.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
public class UserRequestDto {

    @Email(message = "Invalid email format")
    private String email;
    @NotBlank(message = "Password is required")
    private String password;
    @NotBlank
    @Pattern(regexp = "\\d+", message = "Document must contain only numbers")
    private String identification;
    private String name;
    private String lastname;
    @Pattern(regexp = "^[+]?[0-9]{0,13}$", message = "Invalid phone format")
    private String telephone;
    private String role;
}
