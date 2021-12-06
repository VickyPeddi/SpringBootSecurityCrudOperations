package com.example.nanda.controller;

import com.example.nanda.model.Jwtrequest;
import com.example.nanda.securityhepler.CustomUserdetailsservice;
import com.example.nanda.util.Jwtutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @Autowired
    private Jwtutil jwtutil;

    @Autowired

    private CustomUserdetailsservice userderCustomUserdetailsservice;

    @GetMapping("/generatetoken")
    public String returntest(@RequestBody Jwtrequest rJwtrequest) {

        try {
            UserDetails details = null;
//					userderCustomUserdetailsservice.loadUserByUsername(rJwtrequest.getUsername());
            String generateToken = jwtutil.generateToken(details.getUsername());

            System.out.println("generatetoken " + generateToken);
            return generateToken;
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            return localizedMessage;

        }

    }
}
