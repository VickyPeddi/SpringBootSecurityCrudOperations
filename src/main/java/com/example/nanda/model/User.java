package com.example.nanda.model;

import lombok.*;

import javax.persistence.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String email;
    private String role;
    private String status;
}
