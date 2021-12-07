package com.example.nanda.securityhepler;

import com.example.nanda.dao.Userrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserdetailsservice
		implements UserDetailsService
{
    @Autowired
    private Userrepos repos;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.example.nanda.model.User usernameUser= repos.getUserByUsername(username);
        if (usernameUser == null) {
			throw new UsernameNotFoundException("username not found");

		}
		return new User(usernameUser.getUsername(), usernameUser.getPassword(), new ArrayList<>());
	}

}
