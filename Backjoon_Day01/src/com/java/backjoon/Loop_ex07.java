package com.java.backjoon;

import java.util.Scanner;

public class Loop_ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b));
		
		}
		
		sc.close();
	}

}
