package sequênciaBásica;

import java.util.Scanner;

public class atividade11 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("Descubra valor de delta");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    
    double delta = Math.pow(b,2)-(4*a*c);
    System.out.println(delta);
   
    
    
	}

}
