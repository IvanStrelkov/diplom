package by.bsu.strelkov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.bsu.strelkov.dao.RatingDAO;
import by.bsu.strelkov.model.Rating;
import by.bsu.strelkov.service.RatingService;

@Service
public class RatingServiceImpl extends CrudServiceImpl<Rating> implements RatingService {

	private RatingDAO ratingDAO;
	
	@Autowired
	public RatingServiceImpl(RatingDAO ratingDAO) {
		super(ratingDAO);
		this.ratingDAO = ratingDAO;
	}
}
