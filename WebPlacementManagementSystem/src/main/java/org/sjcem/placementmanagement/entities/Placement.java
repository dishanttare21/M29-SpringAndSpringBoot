package org.sjcem.placementmanagement.entities;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Placement {
	
	//private data members
	@Id
	private Integer id;
	private String name;
	private LocalDate date;
	private String qualification;
	private Integer year;
	

	//Default constructor
	public Placement() {
		System.out.println("Demonstration on SpringBoot-REST API");
	}

	//parameterized constructor
	public Placement(Integer id, String name, LocalDate date, String qualification, Integer year) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.qualification = qualification;
		this.year = year;
	}
	
	//setters and getters 
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", date=" + date + ", qualification=" + qualification
				+ ", year=" + year + "]";
	}
	
}
