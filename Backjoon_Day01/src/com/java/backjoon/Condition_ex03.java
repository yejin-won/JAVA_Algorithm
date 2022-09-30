package com.java.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Condition_ex03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int year = Integer.parseInt(st.nextToken());
		String result = "";
		
		if (year % 4 ==0 && (year % 100 != 0 || year % 400 == 0)){
			result = "1";
		}else {
			result = "0";
		}
		
		System.out.println(result);
	}

}
