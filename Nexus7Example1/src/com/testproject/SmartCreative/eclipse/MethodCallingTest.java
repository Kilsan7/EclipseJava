/*******************************************************************
 * 
 * egoing Java 강좌 중 Method 예제 테스트
 * MethodCallingTest2.java와 달리 문자열로 반환함
 * 
 *******************************************************************/
package com.testproject.SmartCreative.eclipse;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class MethodCallingTest {

	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
	    while (i < limit) {
	        output += i;
	        i++;
	    }
	    return output;
	}
	
	public static void main(String[] args) {

		System.out.println("Method calling test.");
		String result;
		result = numbering (0, 9);
		System.out.println("The returned value is : ");
		System.out.println(result);

	}

}
