package org.sjcem.autowiremodes;
//Program to demonstrate on autowiring modes
//driver class
public class TextEditor {

	//DI in the form of objects
	private SpellChecker checker;

	
	//Parameterized constructor
	public TextEditor(SpellChecker checker) {
		super();
		this.checker = checker;
		System.out.println("DI using constructor");
	}

	//getters and setters
	public SpellChecker getChecker() {
		return checker;
	}

	public void setChecker(SpellChecker checker) {
		this.checker = checker;
	}
	
	//methods
	public void display() {
		checker.checkSpelling();
	}
	
}
