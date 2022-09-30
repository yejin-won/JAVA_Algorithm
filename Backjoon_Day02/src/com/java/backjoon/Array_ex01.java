package com.java.backjoon;

import java.util.Scanner;

public class Array_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for (int i=0;i<num;i++) {
			int a = sc.nextInt();
			arr[i] = a; 
		}
		int max = arr[0];
		for (int i=1;i<num;i++) {
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		
		int min = arr[0];
		for (int i=1;i<num;i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min+" "+max);
	}

}
