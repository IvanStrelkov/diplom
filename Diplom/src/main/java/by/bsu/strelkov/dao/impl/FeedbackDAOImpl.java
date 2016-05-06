package by.bsu.strelkov.dao.impl;

import org.springframework.stereotype.Repository;

import by.bsu.strelkov.dao.FeedbackDAO;
import by.bsu.strelkov.model.record.Feedback;

@Repository
public class FeedbackDAOImpl extends CrudDAOImpl<Feedback> implements FeedbackDAO {

	public FeedbackDAOImpl() {
		super(Feedback.class);
	}
}
