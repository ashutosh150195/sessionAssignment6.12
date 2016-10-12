package com.java.assignmentsix.two;

public class ImplementsClass implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int counter = 0;
		for(int i = 2; i <= (int)Math.sqrt(Integer.parseInt(PrimeNumber.input)); i++) {
			if (Integer.parseInt(PrimeNumber.input) % i == 0) {
				++counter;
				System.out.println("Not prime Number... ");
				break;
			}
		}
		
		if (counter == 0) {
			System.out.println("Prime Number .....");
		}
		
	}

}
