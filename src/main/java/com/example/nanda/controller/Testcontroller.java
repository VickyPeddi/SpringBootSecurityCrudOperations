package com.example.nanda.controller;

import com.example.nanda.model.Jwtrequest;
import com.example.nanda.securityhepler.CustomUserdetailsservice;
import com.example.nanda.util.Jwtutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/take/")
public class Testcontroller {
    @Autowired
    private Jwtutil jwtutil;
    @Autowired
    AuthenticationManager manager;
    @Autowired

    private CustomUserdetailsservice userderCustomUserdetailsservice;

    @RequestMapping("/taketoken")
    public ModelAndView gototoken(@ModelAttribute("jwtrequest") Jwtrequest jwtrequest) {

        return new ModelAndView("Testpage");
    }

    @PostMapping("/generatetoken")
    public ModelAndView returntest(@ModelAttribute("jwtrequest") Jwtrequest jwtrequest) {
        try {

            Authentication authenticate = manager.authenticate(new UsernamePasswordAuthenticationToken(jwtrequest.getUsername(), jwtrequest.getPassword()));


        } catch (Exception e) {

        }

        UserDetails userDetails = userderCustomUserdetailsservice.loadUserByUsername(jwtrequest.getUsername());
        String token = jwtutil.generateToken(userDetails.getUsername());
        return new ModelAndView("Testpage", "token",token );

    }
}
