package com.bmi.BMIProject;

public class ComputeBMI {
	
	private double bmi;
	
	public ComputeBMI(){
		super();
	}
	
	public double getBMI(){
		return bmi;
	}
	
	public void setBMI(double height, double weight){
		bmi = weight / (height * height);
	}
	
}
