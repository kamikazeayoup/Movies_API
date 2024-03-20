package com.sumerge.authservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

public class LoginDto {
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Invalid email format")
    private String email;
    private String password;
    private String captchaToken;

    public LoginDto(){

    }
    public LoginDto(String email , String password , String captchaToken){
        this.email = email;
        this.password = password;
        this.captchaToken = captchaToken;
    }
}
