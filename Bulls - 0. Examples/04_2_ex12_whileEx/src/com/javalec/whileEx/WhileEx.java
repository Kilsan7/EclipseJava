package com.javalec.whileEx;

public class WhileEx {

	public static void main(String[] args) {
		
		int i = 0;
		int total3 = 0;
		
		while(i <= 100){
			
			if((i % 3) == 0) {
				total3 = total3 + i;
			}
			
			i++;
		}
		
		System.out.println("total3 = " + total3);
	}
	
	
}
