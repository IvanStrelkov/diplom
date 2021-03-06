package by.bsu.strelkov.dao.impl;

import org.springframework.stereotype.Repository;

import by.bsu.strelkov.dao.CommentDAO;
import by.bsu.strelkov.model.record.Comment;

@Repository
public class CommentDAOImpl extends CrudDAOImpl<Comment> implements CommentDAO {

	public CommentDAOImpl() {
		super(Comment.class);
	}
}
