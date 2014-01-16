package com.bmi.BMIProject;

class User {

	private double height;

	private double weight;

	public String fname;

	public String lname;

	public String name;

	public String mname;
	
	public User() {

		super();

	}

	public double getHeight() {

		return height;

	}

	public void setHeight(double height) {

		this.height = height;

	}

	public double getWeight() {

		return weight;

	}

	public void setWeight(double weight) {

		this.weight = weight;

	}
	
	public String getFirstName() {

		return fname;

	}

	public void setFirstName(String fname) {

		this.fname = fname;

	}

	public String getLastName() {

		return lname;

	}

	public void setLastName(String lname) {

		this.lname = lname;

	}
	
	public String setMidName(){
		return mname;
	}
	
	public void setMidName(String mname){
		this.mname = mname;
	}

	public String getFullName() {

		name = lname + ", " + fname + " "+ mname;

		return name;

	}

}
