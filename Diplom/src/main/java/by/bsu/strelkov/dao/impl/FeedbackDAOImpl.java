package by.bsu.strelkov.dao.impl;

import by.bsu.strelkov.dao.FeedbackDAO;
import by.bsu.strelkov.model.record.Feedback;

public class FeedbackDAOImpl extends CrudDAOImpl<Feedback> implements FeedbackDAO {

	public FeedbackDAOImpl() {
		super(Feedback.class);
	}
}
