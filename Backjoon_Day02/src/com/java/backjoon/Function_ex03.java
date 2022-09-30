package com.java.backjoon;

import java.util.Scanner;

public class Function_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] arr = new int[3];
		int han = 0,k = 0;
		
		for (int i=1;i<=num;i++) {
			if(i>0&&i<100) han =i;
			else if(i==1000) break;
			else {
				int t = i;
				k=0;
				while(t>0) {
					arr[k] = t% 10;
					t /=10;
					k++;
				}
				if(arr[0]-arr[1]==arr[1]-arr[2]) han++;
			}
		}
		System.out.println(han);
	}

}
