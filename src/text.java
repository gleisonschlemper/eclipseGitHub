import java.util.Random;

public class text {

	public static void main(String[] args) {
		 Random in = new Random();
	        int array[]= new int[20];
	        int i;
	        int j;
	        int aux;
	        
	          
	        for(i=0; i<array.length;i++){
	        	array[i] = in.nextInt(100);
	        } 
	        System.out.println(" "); 
	        
	        for(i=0;i<array.length;i++){
	            for(j=0; j<array.length -1;j++){
	            	
	               if(array[j] > array[j+1]){
	            	   
	                 aux=array[j];
	                 array[j]=array[j+1];
	                 array[j+1]=aux;
	                 
	               } 
	               
	            }
	            
	        } 
	        
	        for(i=0;i<array.length;i++){
	             System.out.print(array[i]+ " ");
	        }
	}

}
