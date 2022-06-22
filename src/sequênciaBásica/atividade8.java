package sequênciaBásica;

import java.util.Scanner;

public class atividade8 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("Digite valor em metros");
    double metros = input.nextDouble();
    double km = metros/1000;
    double hm = metros/100;
    double dam = metros/10;
    double dem = metros * 10;
    double cm = metros * 100;
    double mm = metros * 1000;
    
    System.out.println("Quilômetros: "+km+" km");
    System.out.println("Hectômetro: "+hm+" hm" );
    System.out.println("Decâmetro: "+dam+" dam");
    
    System.out.println("Decímetro: "+dem+" dem");
    System.out.println("Centímetro :"+cm+" cm");
    System.out.println("Milímetro: "+mm+" mm");
	}

}
