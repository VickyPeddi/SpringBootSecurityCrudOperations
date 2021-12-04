package com.example.nanda.model;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Jwtrequest {
    private String username;
    private String password;
}
