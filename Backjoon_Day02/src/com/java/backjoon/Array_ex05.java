package com.java.backjoon;

import java.util.Scanner;

public class Array_ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[num];
		
		
		for(int i=0;i<arr.length;i++) {
			int count = 0; // ī��Ʈ��
			int sum = 0; // ������
			
			arr[i] = sc.next(); 
			for(int j=0;j<arr[i].length();j++) {
				// 'O'�� ������ count++
				if(arr[i].charAt(j)=='O') {
					count++;
				}else {
					count = 0;
				}
				// for���� ���� count���� sum�� ��� ������
				sum +=count;
			}
			System.out.println(sum);
		}
	}

}
