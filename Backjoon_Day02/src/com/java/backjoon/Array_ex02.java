package com.java.backjoon;

import java.util.Scanner;

public class Array_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i=0;i<9;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int pos = 1;
		for(int i=0;i<9;i++) {
			if(max<arr[i]) {
				max = arr[i];
				pos = (i+1);
			}
		}
		System.out.println(max);
		System.out.println(pos);
	}

}
