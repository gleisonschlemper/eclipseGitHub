package sequ�nciaB�sica;

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
    
    System.out.println("Quil�metros: "+km+" km");
    System.out.println("Hect�metro: "+hm+" hm" );
    System.out.println("Dec�metro: "+dam+" dam");
    
    System.out.println("Dec�metro: "+dem+" dem");
    System.out.println("Cent�metro :"+cm+" cm");
    System.out.println("Mil�metro: "+mm+" mm");
	}

}
