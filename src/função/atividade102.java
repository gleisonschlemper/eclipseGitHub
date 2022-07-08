package função;

import java.util.Random;
import java.util.Scanner;

public class atividade102 {
	
	public static double media(double a, double b) {
		double media = (a+b)/2;
		return media;
	}
	
	public static String situacao(double a) {
		String result = "";
		
		if(a > 7 && a < 10) {
			result = "Aprovado";
		}
		else if(a > 0 && a < 7){
			result = "Reprovado";
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	Random gerador = new Random();
	
	double nota1 = input.nextDouble();
	double nota2 = input.nextDouble();
	
	System.out.println(
			situacao(
					media(nota1,nota2)
					)
			//pega o valor da media como parâmetro para situação
			);
	
	}

}
