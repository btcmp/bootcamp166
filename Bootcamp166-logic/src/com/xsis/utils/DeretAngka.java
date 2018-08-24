package com.xsis.utils;

import java.util.Arrays;

public class DeretAngka {
	
	//output :  1,1,2,5,8..
	public int[] getFibo(int n) {
		int[] data = new int[n];
		data[0] = 1;
		data[1] = 1;
		for (int i = 2; i < n; i++) {
			data[i] = data[i - 1] + data[i - 2];
		}
		
		return data;
	}
	
	//output : 1, ,3, ,5, ,7
	public String[] getGanjilKosong(int n) {
		String[] data = new String[n];
		int index = 1;
		for (int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				data[i] = index+"";
			} else { 
				data[i] = " ";
			}
			index++;
		}
		return data;
	}
	
	public static void main(String[] args) {
		DeretAngka da = new DeretAngka();
		String[] data = da.getGanjilKosong(9);
		System.out.println(Arrays.toString(data));
	}
	
}
