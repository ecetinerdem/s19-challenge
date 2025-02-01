package com.fsweb.s19_challenge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(schema = "fsweb", name = "retweet")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Retweet {

    @Id
    @GeneratedValue
}
