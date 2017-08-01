/*******************************************************************
 * 
 * egoing Java 강좌 중 Method 예제 테스트
 * MethodCallingTest2.java와 달리 문자열로 반환함
 * --> File로 저장하는 변형 코드임
 * 
 *******************************************************************/
package com.testproject.SmartCreative.eclipse;

/* 아래 java library는 file writing을 위한 것들임 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MethodCallingTest3 {

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
		String result = numbering (0, 30);
		System.out.println("The returned value is : " + result);

        try { 
            // 다음 행은 out.txt 라는 파일에 numbering이라는 메소드가 반환한 값을 저장합니다.
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();        /* 성공하면 이 프로젝트 루트 디렉토리에 out.txt 생성됨 */
        } catch (IOException e) {
        	System.out.println(e.getMessage());
        } 
	}

}
