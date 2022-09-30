package com.java.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Condition_ex06 {

	public static void main(String[] args) throws NumberFormatException,IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		
		H += (M+C) / 60;
		if (H>=24) {
			H -= 24;
		}	
		M = (M+C) % 60; 
		
		System.out.print(H + " " + M);
	}

}
