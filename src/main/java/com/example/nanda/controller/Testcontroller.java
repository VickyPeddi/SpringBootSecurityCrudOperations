package com.example.nanda.controller;

import com.example.nanda.model.Jwtrequest;
import com.example.nanda.securityhepler.CustomUserdetailsservice;
import com.example.nanda.util.Jwtutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Testcontroller {
    @Autowired
    private Jwtutil jwtutil;

    @Autowired

    private CustomUserdetailsservice userderCustomUserdetailsservice;

    @PostMapping("/generatetoken")
    public String returntest(Principal principal) {

        try {
//            UserDetails details = userderCustomUserdetailsservice.loadUserByUsername(rJwtrequest.getUsername());
            String name = principal.getName();
            System.out.println(name);
            String generateToken = jwtutil.generateToken(name);

            System.out.println("generatetoken " + generateToken);
            return generateToken;
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            return localizedMessage;

        }

    }
}
