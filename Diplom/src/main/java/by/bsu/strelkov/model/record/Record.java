package by.bsu.strelkov.model.record;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import by.bsu.strelkov.model.Like;
import by.bsu.strelkov.model.User;

@MappedSuperclass
public abstract class Record implements Serializable {

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
	protected Date recordDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profile_id", nullable = false)
	protected User user;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "record")
	protected List<Like> likes;

	public Record() {
		super();
		likes = new ArrayList<Like>();
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

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Like> getLikes() {
		return likes;
	}

	public void setLikes(List<Like> likes) {
		this.likes = likes;
	}

}
