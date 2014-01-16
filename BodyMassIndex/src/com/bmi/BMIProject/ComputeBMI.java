package com.bmi.BMIProject;

public class ComputeBMI extends User {

	private double bmi;

	private String result;

	public ComputeBMI() {

		super();

	}

	public String getBMI(double height, double weight) {

		weight = weight * 2.2;

		height = height * 12;

		bmi = (weight * 703) / (height * height);

		if (bmi <= 18.5) {

			result = "Underweight. Your BMI: " + String.valueOf(bmi);

		} else if (bmi >= 18.5 && bmi <= 24.9) {

			result = "Normal. Your BMI: " + String.valueOf(bmi);

		} else if (bmi >= 25 && bmi <= 29.9) {

			result = "Overweight. Your BMI: " + String.valueOf(bmi);

		} else if (bmi > 30) {

			result = "Obese. Your BMI: " + String.valueOf(bmi);

		} else {

			result = "Invalid Input";

		}

		return result;
	}

}
