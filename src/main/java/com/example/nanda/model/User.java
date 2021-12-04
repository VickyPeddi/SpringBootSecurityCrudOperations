package com.example.nanda.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class User {
    @Id
    private int id;
    private String username;
    private String password;
    private  String email;
}
