package com.xsis.logic3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import com.xsis.utils.DeretAngka;

public class Soal8B {

	//deklarasi
	int baris = 0;
	int kolom = 0;
	String[][] data = null;
	
	//logic here..
	public void setArray(int n) {
		this.baris = n;
		this.kolom = n;
		this.data = new String[this.baris][this.kolom];
		DeretAngka da = new DeretAngka();
		int[] fibo = da.getFibo(n);
		System.out.println(Arrays.toString(fibo));
		
		
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(i >= j && i + j <= n - 1) {
					this.data[i][j]= fibo[j]+"";
				} else if(j >= i && i + j <= n - 1) {
					this.data[i][j]= fibo[i]+"";
				} else if(j >= i) {
					this.data[i][j]= fibo[n-1 - j] + "";
				} else {
					this.data[i][j]= fibo[n-1-i]+"";
				}
				
			}
		}
	}
	
	//just for showing..
	public void showArray() {
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				System.out.print(this.data[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		Soal8B soal = new Soal8B();
		Scanner scan = new Scanner(System.in);
		System.out.print("Angka : >> ");
		int data = scan.nextInt();
		
		/*InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Masukkan nilai angka : ");
		int n = Integer.parseInt(br.readLine());
		*/soal.setArray(data);
		soal.showArray();
	}
}
