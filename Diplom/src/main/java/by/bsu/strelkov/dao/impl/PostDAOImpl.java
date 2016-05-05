package by.bsu.strelkov.dao.impl;

import by.bsu.strelkov.dao.PostDAO;
import by.bsu.strelkov.model.record.Post;

public class PostDAOImpl extends CrudDAOImpl<Post> implements PostDAO {

	public PostDAOImpl() {
		super(Post.class);
	}
}
