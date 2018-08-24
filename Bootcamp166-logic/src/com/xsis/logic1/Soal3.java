package com.xsis.logic1;

public class Soal3 {

	public static void main(String[] args) {
		int input = 9;
		int x = input;
		int y = input;
		
		for (int i = 0; i < y; i++) {
			for(int j = 0; j < x; j++) {
				if(i==j || i + j == input - 1) // AND - mengurangi 
					System.out.print(i + "," + j +"\t");
				/*else if(i+j == input - 1) // OR
					System.out.print(i + "," + j +"\t");
				*/else // OR - menambah
					System.out.print("-\t");
			}
			System.out.println();
		}
	}
}
