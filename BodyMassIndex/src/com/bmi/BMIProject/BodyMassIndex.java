package com.bmi.BMIProject;

import java.util.Scanner;

public class BodyMassIndex extends User {

	private static Scanner sc;

	private static User usr;

	private static ComputeBMI cmptBMI;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		cmptBMI = new ComputeBMI();

		usr = new User();

		System.out.print("What is your first name?\t");

		usr.setFirstName(sc.next());

		System.out.print("What is your middle name?\t");

		usr.setMidName(sc.next());

		System.out.print("What is your last name?\t\t");

		usr.setLastName(sc.next());

		System.out
				.println("------------------------------------------------------");

		System.out
				.println("To compute your Body Mass Index. Let me know your Weight and Height.");

		System.out.print("Weight(lbs): ");

		usr.setWeight(sc.nextDouble());

		System.out.print("Height(ft.inch): ");

		usr.setHeight(sc.nextDouble());

		System.out
				.println("------------------------------------------------------");

		System.out.println("Name: " + usr.getFullName());

		System.out.println("Weight(lbs): " + usr.getWeight());

		System.out.println("Height(ft.inch): " + usr.getHeight());

		System.out
				.println("------------------------------------------------------");

		System.out
				.println("Based on the information you have given, you are: ");

		System.out.print(cmptBMI.getBMI(usr.getHeight(), usr.getWeight()));

		sc.close();

	}

}
