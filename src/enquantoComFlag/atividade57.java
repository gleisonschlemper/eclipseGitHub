package enquantoComFlag;

import java.util.Scanner;

public class atividade57 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	String continuar = "sim";
	double pagarMulheres=0;
	double pagarHomens=0;
		
	
	while(continuar.equalsIgnoreCase("sim")) {
		System.out.println("Informe o sexo do funcionario?");
		String sexo = input.next();
	
		if(sexo.equalsIgnoreCase("f")) {
			
			System.out.println("Informe salário do funcionario?");
			double salario = input.nextDouble();	
			pagarMulheres+=salario;
			
			
		}
		
		else if(sexo.equalsIgnoreCase("m")) {
			
			System.out.println("Informe salário do funcionario?");
			double salario = input.nextDouble();	
			pagarHomens+=salario;
			

		}
			System.out.println("Deseja continuar?");
		    continuar = input.next();
	    
		}
	
	
		
		System.out.println("Valor a se pago para os homens: "+pagarHomens);
		System.out.println("Valor a se pago para as melheres: "+pagarMulheres+" \n");
	
		if(continuar.equalsIgnoreCase("não"))	{
			System.out.println("PROGRAMA ACABOU");
		}
	}   
	
	
	
		
	

}
