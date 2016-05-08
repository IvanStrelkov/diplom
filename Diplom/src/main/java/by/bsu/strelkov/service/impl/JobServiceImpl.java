package by.bsu.strelkov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.bsu.strelkov.dao.JobDAO;
import by.bsu.strelkov.model.record.Job;
import by.bsu.strelkov.service.JobService;

@Service
public class JobServiceImpl extends CrudServiceImpl<Job> implements JobService {


	private JobDAO feedbackDAO;
	
	@Autowired
	public JobServiceImpl(JobDAO feedbackDAO) {
		super(feedbackDAO);
		this.feedbackDAO = feedbackDAO;
	}

}
