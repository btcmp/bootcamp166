package com.xsis.logic1;

public class Soal6 {

	public static void main(String[] args) {
		int input = 9;
		int x = input;
		int y = input;
		
		for (int i = 0; i < y; i++) {
			for(int j = 0; j < x; j++) {
				if(i+j >= input - 1) 
					System.out.print(i + "," + j +"\t");
				else 	
					System.out.print("-\t");
			}
			System.out.println();
		}
	}
}
