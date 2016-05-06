package by.bsu.strelkov.dao.impl;

import org.springframework.stereotype.Repository;

import by.bsu.strelkov.dao.PostDAO;
import by.bsu.strelkov.model.record.Post;

@Repository
public class PostDAOImpl extends CrudDAOImpl<Post> implements PostDAO {

	public PostDAOImpl() {
		super(Post.class);
	}
}
