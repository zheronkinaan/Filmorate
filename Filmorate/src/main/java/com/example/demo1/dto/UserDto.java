package com.example.demo1.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.Date;
@Data
@Builder
public class UserDto {
    private int id;
    @NonNull
    @Email
    private String email;
    @NonNull
    private String login;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String name;
}
