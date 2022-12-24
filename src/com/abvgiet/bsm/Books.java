package com.abvgiet.bsm;



public class Books {
private int Book_id,Price,Edition,Quantity;
private String ISBN,Author,Title,Category,Sub_category;


public Books() {}

public Books(
    int Book_id,
    String ISBN ,
    String Author ,
    String Title ,
    int Quantity, 
    int Edition ,
    String Category , 
    String Sub_category, 
    int Price) {
	super();
	
this.Book_id = Book_id;
this.ISBN = ISBN;
this.Author = Author;
this.Title =Title;
this.Quantity = Quantity;
this.Edition = Edition;
this.Category = Category;
this.Sub_category =Sub_category;
this.Price = Price;
}

// public Books(int rollno, String name, String email, String course, int fee, int paid, int due, String address,
// 		String city, String state, String country, String contactno) {
// 	super();
// 	this.rollno = rollno;
// 	this.name = name;
// 	this.email = email;
// 	this.course = course;
// 	this.fee = fee;
// 	this.paid = paid;
// 	this.due = due;
// 	this.address = address;
// 	this.city = city;
// 	this.state = state;
// 	this.country = country;
// 	this.contactno = contactno;
// }

public int getBook_id() {
	return Book_id;
}
public void setBook_id(int Book_id) {
	this.Book_id = Book_id;
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String ISBN) {
	this.ISBN = ISBN;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String Author) {
	this.Author = Author;
}
public String getTitle() {
	return Title;
}
public void setTitle(String Title) {
	this.Title = Title;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int Quantity) {
	this.Quantity = Quantity;
}
public int getEdition() {
	return Edition;
}
public void setEdition(int Edition) {  
	this.Edition = Edition;
}
public String getCategory() {
	return Category;
}
public void setCategory(String Category) {
	this.Category = Category;
}
public String getSub_category() {
	return Sub_category;
}
public void setSub_category(String Sub_category) {
	this.Sub_category = Sub_category;
}
public int getPrice() {
	return Price;
}
public void setPrice(int Price) {
	this.Price = Price;
}

	public Books(String Title) {

		this.Title=Title;

	}
}

