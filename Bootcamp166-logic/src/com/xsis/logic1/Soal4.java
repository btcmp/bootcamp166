package com.xsis.logic1;

public class Soal4 {

	public static void main(String[] args) {
		int input = 9;
		int x = input;
		int y = input;
		
		for (int i = 0; i < y; i++) {
			for(int j = 0; j < x; j++) {
				if(i == input / 2) { // AND - mengurangi 
					System.out.print(i + "," + j +"\t");
				} else if(i==j || i + j == input - 1) { 
						System.out.print("*\t");
				} else if(j == input / 2) { // OR
					System.out.print(i + "," + j +"\t");
				} else // OR - menambah
						System.out.print("-\t");
					
			}
			System.out.println();
		}
	}
}
