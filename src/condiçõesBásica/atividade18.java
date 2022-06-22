package condiçõesBásica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class atividade18 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	
	LocalDate hoje = LocalDate.now();
	//codigo pega a data de hoje: ano / mes / dias
	System.out.println("Digite ano");
	int datAno = input.nextInt();
	System.out.println("Digite mês");
	int datMes = input.nextInt();
	System.out.println("Digite dia");
	int datDia = input.nextInt();
	
	LocalDate ano = hoje.plusYears(-datAno);
	//pego o ano / mes / dias de hoje menos o ano que nasci
	
	LocalDate mes = ano.plusMonths(-datMes);
	//pego o ano / mes / dias de hoje menos o mês que nasci
	
	LocalDate dia = mes.plusDays(-datDia);
	//pego o ano / mes / dias de hoje menos o dia que nasci
	
	int dataNacimento = dia.getYear();
	//Pego dataNacimento só ano
	System.out.println(dataNacimento);
	
	
	
    
/*
 Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	LocalDate hoje = LocalDate.now();
	
    System.out.println("nasceu quando");
    
    System.out.println("ano");
    int ano = input.nextInt();
    System.out.println("mês");
    int mes = input.nextInt();
    System.out.println("dias");
    int dias = input.nextInt();
    System.out.println("data de hoje");
    System.out.println(hoje);
    System.out.println("data de nacimento");
    System.out.println(ano+"-"+mes+"-"+dias+"\n");
  
    //começo do codigo para descobri a data 
    LocalDate menosAno = hoje.plusYears(-ano);
    LocalDate menosDias = menosAno.plusDays(-dias);
    LocalDate menosMes = menosDias.plusMonths(-mes);	

    LocalDate result = menosMes;
   //codigo que descobri o dia o mes e ano de vida da pessoa 
   
    
    int anoNovo = result.getYear();
    int mesNovo = result.getDayOfYear();
    int diasNovo = result.getDayOfMonth();
 */
	}

}
