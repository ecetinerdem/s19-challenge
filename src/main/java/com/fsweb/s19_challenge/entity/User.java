package com.fsweb.s19_challenge.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(schema = "fsweb", name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "username")
    @NotNull(message = "Username can not be null")
    @NotEmpty(message = "Username can not be empty")
    @NotBlank(message = "Username can not be blank")
    @Size(max = 50, message = "Username cannot be longer than 50 characters")
    private String username;


    @Column(name = "email")
    @Email
    @NotNull(message = "Email can not be null")
    @NotEmpty(message = "Email can not be empty")
    @NotBlank(message = "Email can not be blank")
    @Size(max = 100, message = "Email can not be longer than 100 character")
    private String email;

    @Column(name = "password")
    @NotNull(message = "Password can not be null")
    @NotEmpty(message = "Password can not be empty")
    @NotBlank(message = "Password can not be blank")
    @Size(min = 8, max = 16, message = "Password must be at least 12 character long")
    private String password;

    @Column(name = "created_at")
    @Timestamp
    private LocalDate createdAt;




}
