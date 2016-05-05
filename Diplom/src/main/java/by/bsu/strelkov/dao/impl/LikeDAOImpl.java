package by.bsu.strelkov.dao.impl;

import by.bsu.strelkov.dao.LikeDAO;
import by.bsu.strelkov.model.Like;

public class LikeDAOImpl extends CrudDAOImpl<Like> implements LikeDAO {

	public LikeDAOImpl() {
		super(Like.class);
	}

}
