package by.bsu.strelkov.dao.impl;

import org.springframework.stereotype.Repository;

import by.bsu.strelkov.dao.RatingDAO;
import by.bsu.strelkov.model.Rating;

@Repository
public class RatingDAOImpl extends CrudDAOImpl<Rating> implements RatingDAO {

	public RatingDAOImpl() {
		super(Rating.class);
	}
}
