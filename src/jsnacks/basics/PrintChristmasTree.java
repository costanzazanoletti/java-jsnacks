package jsnacks.basics;


public class PrintChristmasTree {
	public static void main(String[] args) {
		
		// primo for per le righe
		for (int i = 0; i < 10; i++) {
		    
			// secondo for per gli spazi 
			for (int j = 0; j < 10 - i; j++) {
				System.out.print(" ");
			}
			// terzo for per gli asterischi
		    for (int k = 0; k < (2 * i + 1); k++) {
		    	System.out.print("*");
		    }
			System.out.println();
		}
		
	}
}
