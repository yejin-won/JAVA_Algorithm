package com.java.backjoon;

import java.util.Scanner;

public class Loop_ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((a==0)&&(b==0)) {
				break;
			}
			
			System.out.println(a+b);
		}
	}

}
