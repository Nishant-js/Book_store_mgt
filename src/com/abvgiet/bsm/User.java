package com.abvgiet.bsm;


public class User {
// private int id;
private String name,password,contact;
public User() {}
public User(String name, String password, String contact) {
	super();
	this.name = name;
	this.password = password;
	this.contact = contact;
}
public User(String name){
	super();
	this.name=name;
}
// public int getId() {
// 	return id;
// }
// public void setId(int id) {
// 	this.id = id;
// }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getcontact() {
	return contact;
}
public void setcontact(String contact) {
	this.contact = contact;
}

}

