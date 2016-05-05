package by.bsu.strelkov.dao.impl;

import by.bsu.strelkov.dao.RatingDAO;
import by.bsu.strelkov.model.Rating;

public class RatingDAOImpl extends CrudDAOImpl<Rating> implements RatingDAO {

	public RatingDAOImpl() {
		super(Rating.class);
	}
}
