package sequênciaBásica;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("Nome do funcionário");
    String nome = input.next();
    
    System.out.println("salário do funcionário");
    double salario = input.nextDouble();
    
    System.out.println("Mes do salário");
    String mes = input.next();
    
    System.out.println("O funcionario "+nome+" tem um salário de "+salario+" em "+mes);
    
	}

}
