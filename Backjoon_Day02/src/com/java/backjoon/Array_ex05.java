package com.java.backjoon;

import java.util.Scanner;

public class Array_ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[num];
		
		
		for(int i=0;i<arr.length;i++) {
			int count = 0; // 카운트용
			int sum = 0; // 누적용
			
			arr[i] = sc.next(); 
			for(int j=0;j<arr[i].length();j++) {
				// 'O'가 있으면 count++
				if(arr[i].charAt(j)=='O') {
					count++;
				}else {
					count = 0;
				}
				// for문을 통해 count값을 sum에 계속 더해줌
				sum +=count;
			}
			System.out.println(sum);
		}
	}

}
