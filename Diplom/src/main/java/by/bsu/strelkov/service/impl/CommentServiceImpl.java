package by.bsu.strelkov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import by.bsu.strelkov.dao.CommentDAO;
import by.bsu.strelkov.model.record.Comment;
import by.bsu.strelkov.service.CommentService;

public class CommentServiceImpl extends CrudServiceImpl<Comment> implements CommentService {

	private CommentDAO commentDAO;
	
	@Autowired
	public CommentServiceImpl(CommentDAO commentDAO) {
		super(commentDAO);
		this.commentDAO = commentDAO;
	}
}
