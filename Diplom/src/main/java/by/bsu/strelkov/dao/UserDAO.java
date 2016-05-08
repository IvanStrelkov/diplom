package by.bsu.strelkov.dao;

import by.bsu.strelkov.model.User;

public interface UserDAO extends CrudDAO<User>{
	
	public void setRole(User user);
}
