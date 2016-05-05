package by.bsu.strelkov.dao.impl;

import by.bsu.strelkov.dao.UserDAO;
import by.bsu.strelkov.model.User;

public class UserDAOImpl extends CrudDAOImpl<User> implements UserDAO {

	public UserDAOImpl() {
		super(User.class);
	}
	
}
