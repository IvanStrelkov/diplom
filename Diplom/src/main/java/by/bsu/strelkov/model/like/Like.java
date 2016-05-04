package by.bsu.strelkov.model.like;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import by.bsu.strelkov.model.User;
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
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "foreign", 
	parameters = @Parameter(name = "property", value = "record"))
	@Column(name = "id")
	protected Long id;
		
	protected User fromUser;
	
	@OneToOne
	@PrimaryKeyJoinColumn
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

	public User getFromUser() {
		return fromUser;
	}

	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	
}
