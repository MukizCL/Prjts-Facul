package lista.JavaBasico;

public class NumerosPrimos1a50 {

	public static void main (String[] args)	{		
		String numerosPrimos = "";

		for (int i = 1; i <= 50; i++) { 		  	  
			int contador = 0; 	
			
			for (int num = i; num >= 1; num--) {
				if(i % num == 0) {
					contador++;					
				}
			}
			
			if (contador == 2) {				
				numerosPrimos = numerosPrimos + i + ", ";
			}	
		}
		
		System.out.println("Os números primos entre 1 e 50 são: " + numerosPrimos);
	}	

}