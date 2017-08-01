/*********************************************************
 *
 *  String Array 생성과 Value Assign & 출력 Test
 *  + for each 연습
 *  
 *********************************************************/
package com.testproject.SmartCreative.eclipse;

public class HelloWorld {

	public static void main(String[] args) {

        String[] classGroup1 = { "최진혁", "최유빈", "한이람", "이고잉" };
        String[] classGroup2 = new String[4];

        classGroup2[0] = "최진혁";
        classGroup2[1] = "최유빈";
        classGroup2[2] = "한이람";
        classGroup2[3] = "이고잉";

        System.out.println("당분간은 Hello World로 시작하자!");
        System.out.println("두 가지 방식의 문자열 Array 생성 Test");
        
        System.out.println("classGroup1.length = "+ classGroup1.length);
        System.out.println("classGroup2.length = "+ classGroup2.length);

        for (int i = 0; i < 4; i++) {
        	System.out.println("classGroup1의 멤버 "+  Integer.toString(i + 1) + "은(는) : " + classGroup1[i]);
        }
        
        for (int i = 0; i < 4; i++) {
        	System.out.println("classGroup2의 멤버 " + Integer.toString(i + 1) + "은(는) : " + classGroup2[i]);
        }

        System.out.println("for-each loop 테스트");
        for (String strMem : classGroup1)
        	System.out.println("classGroup1의 멤버 : " + strMem);
	}

	private static String String(int i) {

		return null;
		
	}

}
