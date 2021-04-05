package org.simplilearn.workshop.model;

public class Customer {
	private Long id;
	private String name;
	private String email;
	private String phno;
	//default constructor
	public Customer() {
		super();
	}
	//parameterized constructor
	public Customer(Long id, String name, String email, String phno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
}
