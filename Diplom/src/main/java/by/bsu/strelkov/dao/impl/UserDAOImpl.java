package by.bsu.strelkov.dao.impl;

import org.springframework.stereotype.Repository;

import by.bsu.strelkov.dao.UserDAO;
import by.bsu.strelkov.model.User;

@Repository
public class UserDAOImpl extends CrudDAOImpl<User> implements UserDAO {

	public UserDAOImpl() {
		super(User.class);
	}

	@Override
	public void setRole(User user) {
		// TODO Auto-generated method stub
		
	}
	
}
