package sequ�nciaB�sica;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("Nome do funcion�rio");
    String nome = input.next();
    
    System.out.println("sal�rio do funcion�rio");
    double salario = input.nextDouble();
    
    System.out.println("Mes do sal�rio");
    String mes = input.next();
    
    System.out.println("O funcionario "+nome+" tem um sal�rio de "+salario+" em "+mes);
    
	}

}
