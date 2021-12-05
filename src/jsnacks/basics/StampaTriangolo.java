package jsnacks.basics;

import java.util.Scanner;

public class StampaTriangolo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		do {
			System.out.print("Dimmi un numero da 1 a 9: ");
			input = scan.nextInt();
		} while(input < 1 || input > 9);
		
		System.out.println("Input: " + input);
		
		for (int i = 1; i <= input; ++i) {
		      for (int j = 1; j <= i; ++j) {
		        System.out.print(j + " ");
		      }
		      System.out.println();
		    }
		
		scan.close();
	}
}
