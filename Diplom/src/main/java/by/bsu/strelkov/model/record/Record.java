package by.bsu.strelkov.model.record;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import by.bsu.strelkov.model.User;
import by.bsu.strelkov.model.like.Like;

@Entity
@Table(name = "record")
@Inheritance(strategy=InheritanceType.JOINED)
public class Record implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1794052601788773958L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	protected Long id;
	
	@Column(name = "text")
	protected String text;
	
	@Column(name = "recordDate")
	protected Date postDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	protected User user;
	
	@OneToOne(mappedBy="record", cascade=CascadeType.ALL)
	protected Like like;

	public Record() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Like getLike() {
		return like;
	}

	public void setLike(Like like) {
		this.like = like;
	}
	
}
