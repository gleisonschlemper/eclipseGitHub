package condiçõesComposta;

import java.util.Scanner;

public class atividade27 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("Digite largura");
    double largura = input.nextDouble();
    
    System.out.println("Digite comprimento");
    double comprimento = input.nextDouble();
    
    double area =  largura * comprimento;
    
    if(area > 0.0 && area < 100.0) {
    	System.out.println(" TERRENO POPULAR");
    }
    
    else if(area >= 100.0 && area <= 500.0) {
    	System.out.println("TERRENO MASTER");
    }
    
    else if(area > 500.0){
    	System.out.println("TERRENO VIP");
    }
    
    else {
    	System.out.println("Valor não existente");
    }
    
	}

}
