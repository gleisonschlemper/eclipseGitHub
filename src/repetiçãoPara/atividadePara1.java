package repetiçãoPara;

import java.util.Scanner;

public class atividadePara1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
	System.out.println("qual tabuada você quer?");
	int tabuada = input.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i+" X "+tabuada+" = "+(i * tabuada));
		}
	}

}
