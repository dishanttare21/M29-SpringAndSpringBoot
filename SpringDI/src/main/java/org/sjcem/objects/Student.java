package org.sjcem.objects;
//program to demonstrate on dependency injection in the form of object
public class Student {
	//DI in the form of objects
	Address address;
	
	
	//Achieving DI using constructor
	public Student(Address address) {
		super();
		this.address = address;
	}
	
	//methods
	public void print() {
		//we are calling display method of address class here
		address.display();
	}
}
