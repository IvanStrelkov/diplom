package by.bsu.strelkov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import by.bsu.strelkov.dao.PostDAO;
import by.bsu.strelkov.model.record.Post;
import by.bsu.strelkov.service.PostService;

public class PostServiceImpl extends CrudServiceImpl<Post> implements PostService {

	private PostDAO postDAO;
	
	@Autowired
	public PostServiceImpl(PostDAO postDAO) {
		super(postDAO);
		this.postDAO = postDAO;
	}

}
