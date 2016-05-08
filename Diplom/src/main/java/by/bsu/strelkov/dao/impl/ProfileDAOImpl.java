package by.bsu.strelkov.dao.impl;

import org.springframework.stereotype.Repository;

import by.bsu.strelkov.dao.ProfileDAO;
import by.bsu.strelkov.model.Profile;

@Repository
public class ProfileDAOImpl extends CrudDAOImpl<Profile> implements ProfileDAO{

	public ProfileDAOImpl() {
		super(Profile.class);
	}

}
