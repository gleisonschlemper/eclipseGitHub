package sequênciaBásica;

import java.util.Scanner;

public class atividade16 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	// TODO Auto-generated method stub
    
	System.out.println("Quantos cigarro fuma por dias");
	int fumaDias = input.nextInt();

	System.out.println("Quanto tempo já fuma em anos");
	int tempoFuma = input.nextInt();
	
	tempoFuma = tempoFuma * 365;
	// tempo vezes 365; para defenir o tempo em anos
	int vidaHoras = fumaDias * tempoFuma;
	// quantidades que fuma por dia vezes o tempo
	int vidaFumando = vidaHoras / 6;
	// defino o vidaFumando em horas 
	int fumando = vidaFumando/24;
	// defino o vidaFumando em dias 
	System.out.println(fumando+" de redução do tempo de vida em dias.");
	
	
    
    
    
    
    
    
    
    
    
    
	}

}
