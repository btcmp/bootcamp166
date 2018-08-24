package com.xsis.logic1;

public class Soal9 {

	public static void main(String[] args) {
		int input = 9;
		int x = input;
		int y = input;
		
		for (int i = 0; i < y; i++) {
			for(int j = 0; j < x; j++) {
				if((i >= j) && (i + j <= input - 1) ) { // kiri
					System.out.print(i + "," + j +"\t");
				 	
				} else if((j >= i) && (i + j >= input - 1)){ // kanan
					System.out.print("*\t");
				}else { 	
						System.out.print("-\t");
				}
			}
			System.out.println();
		}
	}
}
