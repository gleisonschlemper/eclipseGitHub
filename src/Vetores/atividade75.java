package Vetores;

public class atividade75 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int array [] = new int[17];
	int a = 0;
	int b = 1;
	
	for(int i=0; i<array.length; i++) {
		for(int fibonacci = 1; fibonacci < i;fibonacci++) {

			fibonacci = a + b;
			a = b;
			b = fibonacci;
			
			array[i] = fibonacci;
		
		}
		System.out.println(array[i]+" na poaição "+i);
	}
	
	
	
	}

}
