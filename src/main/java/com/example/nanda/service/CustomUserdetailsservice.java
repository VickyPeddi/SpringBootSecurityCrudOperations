package com.example.nanda.service;

import com.example.nanda.dao.MyUserdao;
import com.example.nanda.dao.MyUserdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomUserdetailsservice
//        implements UserDetailsService
{
	@Autowired
	private MyUserdao repos;

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		com.example.springjwt.model.User username1 = repos.getUserByUsername(username);
//		return new User(username1.getUsername(), username1.getPassword(), new ArrayList<>());
//	}
}
