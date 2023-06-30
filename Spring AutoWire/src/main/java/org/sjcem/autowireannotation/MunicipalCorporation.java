package org.sjcem.autowireannotation;

public class MunicipalCorporation {
	//private data members
	private String area;
	private String mayorName;
	
	//getters and setters
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMayorName() {
		return mayorName;
	}
	public void setMayorName(String mayorName) {
		this.mayorName = mayorName;
	}
	
	//methods
	public void corporate() {
		System.out.println("Municipal Corporation");
	}
	
}
