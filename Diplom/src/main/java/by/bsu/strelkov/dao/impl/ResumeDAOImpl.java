package by.bsu.strelkov.dao.impl;

import org.springframework.stereotype.Repository;

import by.bsu.strelkov.dao.ResumeDAO;
import by.bsu.strelkov.model.record.Resume;

@Repository
public class ResumeDAOImpl extends CrudDAOImpl<Resume> implements ResumeDAO {

	public ResumeDAOImpl() {
		super(Resume.class);
	}
}
