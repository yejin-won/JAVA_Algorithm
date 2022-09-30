package com.java.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Condition_ex05 {

	public static void main(String[] args) throws NumberFormatException,IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if ((H>=0)&&(H<=23)) {
			if ((M>=0)&&(M<45)) {
				if (H == 0) {
					H = 23;
				}else {
					H -= 1;
				}
				M = 60 - 45 + M; 
			}else {
				M = M- 45;
			}
		}else {
			H = 0;
		}
		
		System.out.printf("%d","%d",H,M);
		
	}

}
