package by.bsu.strelkov.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import by.bsu.strelkov.model.record.Record;

@Entity
@Table(name = "like")
@Inheritance(strategy=InheritanceType.JOINED)
public class Like implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8865237775940241122L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	protected Long id;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profile_id", nullable = false)
	protected Profile likeFromProfile;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "record_id", nullable = false)
	private Record record;

	public Like() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public Profile getLikeFromProfile() {
		return likeFromProfile;
	}

	public void setLikeFromProfile(Profile likeFromProfile) {
		this.likeFromProfile = likeFromProfile;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	
}
