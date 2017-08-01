/*******************************************************************
 * 
 * egoing Java 강좌 중 Method 예제 테스트
 * MethodCallingTest.java의 문자열 반환을 sum(int형)으로 변경 연습
 * 
 *******************************************************************/
package com.testproject.SmartCreative.eclipse;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class MethodCallingTest2 {

	public static int numbering(int init, int limit) {
		int i = init;
		int output = 0;
	    while (i < limit) {
	        output += i;
	        i++;
	    }
	    return output;
	}
	
	public static void main(String[] args) {

		System.out.println("Method calling test.");
		int result;
		result = numbering (1, 11);
		System.out.println("The returned value(Sum) is : " + result);

	}

}
