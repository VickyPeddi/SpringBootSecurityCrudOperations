package com.example.nanda.service;

import com.example.springjwt.dao.MyUserdao;
import com.example.springjwt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MyUserservice {
	User myuser;
	@Autowired
	public MyUserdao myUserdao;

	public User createuser(User user) {
		User user1 = myUserdao.save(user);
		return user1;
	}

	public void deleteuser(int id) {
		myUserdao.deleteById(id);
	}

	public User getuserbyUsername(String username) {
		return myUserdao.getUserByUsername(username);
	}

	public List<User> getallUsers() {
		return myUserdao.findAll();
	}

	public User getoneUser(int id) {
		return myUserdao.findById(id).get();
	}
}
