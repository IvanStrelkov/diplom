package by.bsu.strelkov.model.record;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "resume")
public class Resume extends Record {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1676218670284745011L;

	public Resume() {
		super();
		// TODO Auto-generated constructor stub
	}
}
