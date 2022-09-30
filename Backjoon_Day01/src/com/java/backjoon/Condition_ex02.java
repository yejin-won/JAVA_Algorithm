package com.java.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Condition_ex02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String grade = "";
		int score = Integer.parseInt(st.nextToken());
		
		if (score >=90) {
			grade = "A";
		}else if (score >=80) {
			grade = "B";
		}else if (score >=70) {
			grade = "C";
		}else if (score >=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println(grade);
		
	}

}
