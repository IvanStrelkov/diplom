package by.bsu.strelkov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.bsu.strelkov.dao.ResumeDAO;
import by.bsu.strelkov.model.record.Resume;
import by.bsu.strelkov.service.ResumeService;

@Service
public class ResumeServiceImpl extends CrudServiceImpl<Resume> implements ResumeService {

	private ResumeDAO postDAO;
	
	@Autowired
	public ResumeServiceImpl(ResumeDAO postDAO) {
		super(postDAO);
		this.postDAO = postDAO;
	}

}
