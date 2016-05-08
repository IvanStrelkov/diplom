package by.bsu.strelkov.service;

import by.bsu.strelkov.model.User;

public interface UserService extends CrudService<User>{
	
	public void setRole(User user);
	
}
