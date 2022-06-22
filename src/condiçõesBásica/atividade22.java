package condiçõesBásica;

import java.time.LocalDate;
import java.util.Scanner;

public class atividade22 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub

	LocalDate data = LocalDate.now();
	System.out.println( data);
	
	System.out.println("Digite data de nacimento");
	
	System.out.println("Ano");
	int ano = input.nextInt();
	
	System.out.println("Mes");
	int mes = input.nextInt();		
		
	System.out.println("Dia");
	int dia = input.nextInt();
	
	LocalDate datAno = data.plusYears(-ano);
	LocalDate datMes = datAno.plusMonths(-mes);
	LocalDate datDia = datMes.plusDays(-dia);
	
	int nacimento = datDia.getYear();
	System.out.println(nacimento);
	
	if(nacimento > 18) {
	nacimento = nacimento - 18;
	System.out.println("já passou "+nacimento+" do alistamento");
	}
	else if(nacimento < 18) {
	nacimento = nacimento - 18;
	nacimento = nacimento * -1;
	System.out.println("Falta "+nacimento+" para alistamento");
	}
	else {
		System.out.println("Ano de alistamento militar");
	}
	
	
	
	
	}

}
