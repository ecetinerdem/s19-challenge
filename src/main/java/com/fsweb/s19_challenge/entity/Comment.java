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
@Table(schema = "fsweb",name = "comment")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "content")
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 250, message = "Comment cannot be longer than 250 character")
    private String content;

    @Column(name = "created_at")
    @Timestamp
    private LocalDate createdAt;

    @JsonBackReference
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH,CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "tweet_id")
    private Tweet tweet;
}
