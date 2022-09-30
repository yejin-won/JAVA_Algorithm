package com.java.backjoon;

import java.util.Scanner;

public class Array_ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		float[] arr = new float[num];
		float avg = (float)0.0, sum = (float)0.0, max = (float)0.0;
		
		for(int i=0;i<num;i++) {
			int score = sc.nextInt();
			arr[i] = score;
		}
		max = arr[0];
		for(int i=1;i<num;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		for(int i=0;i<num;i++) {
			sum += (arr[i]/max) * 100;
		}
		
		avg = sum/arr.length;
		System.out.print(avg);
	}

}
