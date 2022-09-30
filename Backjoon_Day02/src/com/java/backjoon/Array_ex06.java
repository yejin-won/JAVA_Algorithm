package com.java.backjoon;

import java.util.Scanner;

public class Array_ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();   // 케이스수
		int[] arr;
		
		for (int i = 0; i < c; i++) {
			int n = sc.nextInt();	// 학생수
			arr = new int[n];
			
			int sum = 0;
			
			for(int j = 0; j < n; j++) {
				int point = sc.nextInt();
				arr[j] = point;
				sum += point;
			}
			
			double avg = (double)sum / n;
			double cnt = 0;
			
			for (int j = 0; j < n; j++) {
				if(arr[j] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", cnt / n * 100);
		}
		

		// 다른게 없는데 계속 out of index 에러남
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		int[] score;
//		
//		
//		for(int i=0;i<num;i++) {
//			int count = sc.nextInt();
//			score = new int[num];
//
//			int sum = 0;
//			
//			for(int j=0;j<count;j++) {
//				int val = sc.nextInt();
//				score[j] = val;
//				sum += val;
//			}
//			double avg = (double)sum/count;
//			double under_person = 0;
//			
//			for(int k=0;k<count;k++) {
//				if(score[k]>avg) {
//					under_person++;
//				}
//			}
//			System.out.printf("%.3f%%\n", under_person / count * 100);
//		}
	}

}
