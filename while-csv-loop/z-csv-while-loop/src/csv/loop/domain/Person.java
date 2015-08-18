package csv.loop.domain;

import java.util.Date;

public class Person {
	
	private Integer personId;

	private String firstname;
	
	private String lastname;
	
	private Date birth;

	public String getFirstname() {
		
		return firstname;
	
	}
	
	public Integer getPersonId() {
	
		return personId;
	
	}

	public void setPersonId(Integer personId) {
	
		this.personId = personId;
	
	}
	
	public void setFirstname(String firstname) {
	
		this.firstname = firstname;
	
	}

	public String getLastname() {
	
		return lastname;
	
	}

	public void setLastname(String lastname) {
	
		this.lastname = lastname;
	
	}

	public Date getBirth() {
	
		return birth;
	
	}

	public void setBirth(Date birth) {
		
		this.birth = birth;
	
	}

	public Person() {
		
		super();

	}

	public Person(String firstname, String lastname, Date birth) {
		
		super();
		
		this.firstname = firstname;
		
		this.lastname = lastname;
		
		this.birth = birth;
	
	}

	@Override
	public String toString() {
		
		return "Person [personId=" + personId + ", firstname=" + firstname + ", lastname=" + lastname + ", birth=" + birth + "]";
	
	}
	
}
