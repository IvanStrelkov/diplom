package by.bsu.strelkov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.bsu.strelkov.dao.ProfileDAO;
import by.bsu.strelkov.model.Profile;
import by.bsu.strelkov.service.ProfileService;

@Service
public class ProfileServiceImpl extends CrudServiceImpl<Profile> implements ProfileService {

	private ProfileDAO profileDAO;
	
	@Autowired
	public ProfileServiceImpl(ProfileDAO profileDAO) {
		super(profileDAO);
		this.profileDAO = profileDAO;
	}

}
