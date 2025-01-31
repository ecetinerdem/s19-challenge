package com.fsweb.s19_challenge.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(schema = "fsweb", name = "tweet")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "content")
    @NotBlank(message = "Tweet cannot be blank")
    @NotEmpty(message = "Tweet cannot be empty")
    @NotNull(message = "Tweet cannot be null")
    @Size(max = 250, message = "Tweet cannot be longer than 250 character")
    private String content;

    @Column(name = "created_at")
    @Timestamp
    LocalDate createdAt;

    @JsonBackReference
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH,CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private User user;


}
