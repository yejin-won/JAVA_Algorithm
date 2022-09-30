package com.java.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Condition_ex04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		String result = "";
		
		if (x>0&&y>0) {
			result = "1";
		}else if(x<0&&y>0) {
			result = "2";
		}else if(x<0&&y<0) {
			result = "3";
		}else {
			result = "4";
		}
		
		System.out.println(result);
	}

}
