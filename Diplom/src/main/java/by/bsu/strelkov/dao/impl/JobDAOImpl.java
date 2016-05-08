package by.bsu.strelkov.dao.impl;

import org.springframework.stereotype.Repository;

import by.bsu.strelkov.dao.JobDAO;
import by.bsu.strelkov.model.record.Job;

@Repository
public class JobDAOImpl extends CrudDAOImpl<Job> implements JobDAO {

	public JobDAOImpl() {
		super(Job.class);
	}
}
