package com.gmail.tachtomita.javapractice;

public class BmiCalc {

	public static void main(String[] args) {
		double weight, height, bmi;
		weight = 60;
		height = 180;
		height /= 100;
		
		bmi = weight / (height * height);
		
		System.out.println(bmi);

	}

}
