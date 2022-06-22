package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	int a = 0;
	int b = 1;
	
	
	for(int fibonacci =1;fibonacci<=10;fibonacci++) {

		fibonacci = a + b;
		a = b;
		b = fibonacci;
		
		System.out.println(fibonacci);
	
	}
	
	}

}
