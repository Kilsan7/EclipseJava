/*******************************************************************
 * 
 * egoing Java ���� �� Method ���� �׽�Ʈ
 * MethodCallingTest.java�� ���ڿ� ��ȯ�� sum(int��)���� ���� ����
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
