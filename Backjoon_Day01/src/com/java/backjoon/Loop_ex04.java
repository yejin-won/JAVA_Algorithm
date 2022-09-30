package com.java.backjoon;

import java.util.Scanner;

public class Loop_ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tot = sc.nextInt();
		int count = sc.nextInt();
		
		int sum = 0;
		
		for(int i =0;i<count;i++) {
			int price = sc.nextInt();
			int count1 = sc.nextInt();
			
			sum += (price * count1);
		}
		
		if(tot == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
