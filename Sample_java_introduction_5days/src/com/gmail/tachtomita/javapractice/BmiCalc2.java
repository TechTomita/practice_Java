package com.gmail.tachtomita.javapractice;
import java.util.Scanner;
public class BmiCalc2 {

	public static void main(String[] args) {
		double weight, height, bmi;
		
		Scanner stdIn = new Scanner(System.in);
		weight = stdIn.nextDouble();
		
		height = new java.util.Scanner(System.in).nextDouble();
		
		bmi = weight / (height * height);
		System.out.println("bmi: " + bmi);
	}

}
