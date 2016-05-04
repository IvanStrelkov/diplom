package by.bsu.strelkov.model.record;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "post")
@PrimaryKeyJoinColumn(name = "record_id")
public class Post extends Record{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1676218670284745011L;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
}
