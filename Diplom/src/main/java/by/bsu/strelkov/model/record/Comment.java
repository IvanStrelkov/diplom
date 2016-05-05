package by.bsu.strelkov.model.record;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment extends Record {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1388294171406612329L;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
