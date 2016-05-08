package by.bsu.strelkov.model.record;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Job")
public class Job extends Record implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 122741675237633962L;

	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
}
