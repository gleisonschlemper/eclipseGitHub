package sequênciaBásica;

import java.util.Scanner;

public class atividade14 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("a quantidade de Km percorridos por um carro alugado e a\r\n"
    +"quantidade de dias pelos quais ele foi alugado. \n");
    
    System.out.println("Quilometros percorridos?");
    double km = input.nextDouble();
    
    System.out.println("Dias usados?");
    double dias = input.nextDouble();
    
    km = km * 0.20;
    dias = dias * 90;
    		
    double soma = km + dias;
    System.out.println("Preço do uso do carro: "+soma+" R$");
	}

}
