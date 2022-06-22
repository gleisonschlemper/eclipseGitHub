package função;

import java.util.Random;

public class funcao1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Random random = new Random();
	int x1= random.nextInt(20);
	int x2 = random.nextInt(20);
	calc(x2,x1);
	
	}
	
	static void calc(int x, int y) {
	System.out.println("Soma: "+x+y);
	}

}
