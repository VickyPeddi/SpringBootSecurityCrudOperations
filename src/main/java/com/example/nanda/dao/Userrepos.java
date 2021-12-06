package com.example.nanda.dao;

import com.example.nanda.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepos extends JpaRepository<User, Integer> {
    public UserDetails getUserByUsername(String username) throws UsernameNotFoundException;
}
