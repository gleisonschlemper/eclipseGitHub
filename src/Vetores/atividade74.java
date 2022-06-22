package Vetores;

public class atividade74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int array[] = new int [10];
	
	for(int i=0; i<array.length; i++) {
		
		if((i%2)==0) {
			array[i] = 5;
		}
		else {
			array[i] = 3;
		}
		System.out.println(array[i]+" na posição: "+i);
		
	}
		
	}

}
