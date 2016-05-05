package by.bsu.strelkov.dao.impl;

import by.bsu.strelkov.dao.CommentDAO;
import by.bsu.strelkov.model.record.Comment;

public class CommentDAOImpl extends CrudDAOImpl<Comment> implements CommentDAO {

	public CommentDAOImpl() {
		super(Comment.class);
	}
}
