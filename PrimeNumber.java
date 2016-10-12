package com.java.assignmentsix.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static BufferedReader br ;
	public static String input ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber.br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any +ve integer : ");
		try {
			PrimeNumber.input = PrimeNumber.br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImplementsClass ic = new ImplementsClass();
		Thread t = new Thread(ic);
		t.start();
		
		ExtendsClass ec = new ExtendsClass();
		t = new Thread(ec);
		t.start();

	}

}
