package sequênciaBásica;

import java.util.Scanner;

public class atividade10 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	System.out.println("Saiba a área de uma parede");
    
	System.out.println("Largura");
	double Largura = input.nextDouble();
	
	System.out.println("altura");
	double  altura = input.nextDouble();

	double area = Largura * altura;
	double tinta = area/2;
	
	System.out.println(area+" MetrosQuadrados \n"+tinta+" baldis de tinta");
	
	}

}
