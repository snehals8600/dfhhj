package model;

import jakarte.presiedence.Entity;
@Entity
public class student {
@ id
@Genertedvalue(stretagy=Generate)
private Integer id;

private String name;
private String email;
private String rollno;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
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
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}

}
