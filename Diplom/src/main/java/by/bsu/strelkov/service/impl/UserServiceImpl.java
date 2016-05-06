package by.bsu.strelkov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.bsu.strelkov.dao.UserDAO;
import by.bsu.strelkov.model.User;
import by.bsu.strelkov.service.UserService;

@Service
public class UserServiceImpl extends CrudServiceImpl<User> implements UserService {
	
	private UserDAO userDAO;
	
	@Autowired
	public UserServiceImpl(UserDAO userDAO) {
		super(userDAO);
		this.userDAO = userDAO;
	}	
}
