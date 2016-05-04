package by.bsu.strelkov.model.record;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
@PrimaryKeyJoinColumn(name = "record_id")
public class Feedback implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 122741675237633962L;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
}
