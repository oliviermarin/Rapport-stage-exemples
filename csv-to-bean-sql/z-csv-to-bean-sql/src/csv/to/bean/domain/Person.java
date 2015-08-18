package csv.to.bean.domain;

public class Person {
	
	private Integer personId;

	private String firstname;
	
	private String lastname;
	
	private Integer age;

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
	
	public Integer getAge() {
	
		return age;
	
	}

	public void setAge(Integer age) {
	
		this.age = age;
	
	}

	public Person() {
		
		super();

	}

	public Person(String firstname, String lastname, Integer age) {
		
		super();
		
		this.firstname = firstname;
		
		this.lastname = lastname;
		
		this.age = age;
	
	}

	@Override
	public String toString() {
		
		return "Person [personId=" + personId + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	
	}
	
}
