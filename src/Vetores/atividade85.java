package Vetores;

public class atividade85 {

	public static void main(String[] args) {
	int array [] = new int [10];
	//Controla o quantos valores fibonacci precisa pelo tamnha do seu vetor ou array;

	int aux=1;
	int fibonacci=0;
	int j =1;
	
		for(int i=0; i < array.length; i++) {
		j = fibonacci + aux;
		fibonacci = aux ;
		aux  = j;
		array[i] = j;
		}
		
		for(int i=0; i< array.length; i++) {
			System.out.print(array[i]+" ");
		
		}
			

	
	

	
	
	}

}
