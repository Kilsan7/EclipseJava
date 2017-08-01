package com.javalec.multiArr;

import java.util.Arrays;

public class MultiArrEx {
	public static void main(String[] args) {
		
		int[][] iArr = new int[3][];
		iArr[0] = new int[2];
		iArr[1] = new int[3];
		iArr[2] = new int[2];
		
		iArr[0][0] = 10;
		iArr[0][1] = 20;
		
		iArr[1][0] = 100;
		iArr[1][1] = 200;
		iArr[1][2] = 300;
		
		iArr[2][0] = 1000;
		iArr[2][1] = 2000;
		
		for (int i = 0; i < iArr.length; i++) {
			for(int j=0; j < iArr[i].length; j++) {
				System.out.println(iArr[i][j]);
			}
		}
		
		for (int i = 0; i<iArr.length; i++) {
			System.out.println(Arrays.toString(iArr[i]));
		}
		
		int[][] jArr = new int[3][2];
		jArr[0][0] = 10;
		
	}
}
