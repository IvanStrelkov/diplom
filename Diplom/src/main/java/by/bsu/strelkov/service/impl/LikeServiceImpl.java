package by.bsu.strelkov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.bsu.strelkov.dao.LikeDAO;
import by.bsu.strelkov.model.Like;
import by.bsu.strelkov.service.LikeService;

@Service
public class LikeServiceImpl extends CrudServiceImpl<Like> implements LikeService {

	private LikeDAO likeDAO;
	
	@Autowired
	public LikeServiceImpl(LikeDAO likeDAO) {
		super(likeDAO);
		this.likeDAO = likeDAO;
	}

}
