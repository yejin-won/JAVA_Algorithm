package com.java.backjoon;

import java.util.Scanner;

public class Loop_ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = "";
		
		for (int i= 0;i<num;i++) {
			for (int j=0; j<=i;j++) {
				str += "*";
			}
			str += "\n";
		}
		System.out.println(str);
	}

}
