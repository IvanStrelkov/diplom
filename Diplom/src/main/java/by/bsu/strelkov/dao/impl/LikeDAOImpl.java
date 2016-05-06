package by.bsu.strelkov.dao.impl;

import org.springframework.stereotype.Repository;

import by.bsu.strelkov.dao.LikeDAO;
import by.bsu.strelkov.model.Like;

@Repository
public class LikeDAOImpl extends CrudDAOImpl<Like> implements LikeDAO {

	public LikeDAOImpl() {
		super(Like.class);
	}

}
