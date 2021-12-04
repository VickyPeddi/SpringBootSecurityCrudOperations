package com.example.nanda.dao;

import com.example.nanda.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserdao extends JpaRepository<User, Integer> {
    public User getUserByUsername(String username);
}
