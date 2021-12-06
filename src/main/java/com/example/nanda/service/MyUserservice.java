package com.example.nanda.service;

import com.example.nanda.dao.Userrepos;
import com.example.nanda.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MyUserservice {

    @Autowired
    public Userrepos userrepos;


    public User createuser(User user) {

        return userrepos.save(user);

    }

    public void deleteuser(int id) {
        userrepos.deleteById(id);
    }

//	public User getuserbyUsername(String username) {
//		return userrepos.getUserByUsername(username);
//	}

    public List<User> getallUsers() {
        return userrepos.findAll();
    }

    public User getoneUser(int id) {
        return userrepos.findById(id).get();
    }
}
