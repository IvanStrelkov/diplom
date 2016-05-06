package by.bsu.strelkov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import by.bsu.strelkov.dao.FeedbackDAO;
import by.bsu.strelkov.model.record.Feedback;
import by.bsu.strelkov.service.FeedbackService;

public class FeedbackServiceImpl extends CrudServiceImpl<Feedback> implements FeedbackService {


	private FeedbackDAO feedbackDAO;
	
	@Autowired
	public FeedbackServiceImpl(FeedbackDAO feedbackDAO) {
		super(feedbackDAO);
		this.feedbackDAO = feedbackDAO;
	}

}
