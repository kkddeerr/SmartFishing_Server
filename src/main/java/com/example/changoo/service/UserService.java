package com.example.changoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.changoo.dao.UserDAO;
import com.example.changoo.model.User;

@Service
public class UserService {
	private UserDAO userDAO;

	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public User getUser(String id) {
		return userDAO.getUser(id);

	}
}
