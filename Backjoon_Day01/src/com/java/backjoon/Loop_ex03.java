package com.java.backjoon;

import java.util.Scanner;

public class Loop_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int tot = 0;
		
		for(int i=1;i<=num;i++) {
			tot += i;
		}
		System.out.println(tot);
	}
}
