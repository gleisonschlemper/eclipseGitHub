package enquantoComFlag;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class atividade58 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	int mediaSoma=0;
	int alunos =0;
	
	int idade = 0;
	
	while(idade < 999) {
		alunos++;
		System.out.println("Informe a idade do aluno");
		idade = input.nextInt();
		if(idade < 999) {
		mediaSoma+=idade;
		}
		System.out.println(mediaSoma);
	}
	System.out.println("Mdia de alunos: "+mediaSoma/alunos);
	System.out.println("Alunos: "+alunos);
	}

}
