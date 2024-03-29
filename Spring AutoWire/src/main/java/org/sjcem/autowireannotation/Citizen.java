package org.sjcem.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Citizen {
	
	//DI in the form of DI
	private MunicipalCorporation mc;

	//DI using setters
	//setters
	@Autowired
	@Qualifier("m2")
	public void setMc(MunicipalCorporation mc) {
		this.mc = mc;
	}
	
	//methods
	public void display() {
		mc.corporate();
		System.out.println("Result: "+mc.getMayorName()+" "+mc.getArea());
	}
	
	
}
