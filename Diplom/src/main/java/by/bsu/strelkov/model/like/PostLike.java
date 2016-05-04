package by.bsu.strelkov.model.like;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "postlike")
@PrimaryKeyJoinColumn(name = "like_id")
public class PostLike extends Like {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4240828223339195616L;


}
