/*******************************************************************
 * 
 * egoing Java ���� �� Method ���� �׽�Ʈ
 * MethodCallingTest2.java�� �޸� ���ڿ��� ��ȯ��
 * --> File�� �����ϴ� ���� �ڵ���
 * 
 *******************************************************************/
package com.testproject.SmartCreative.eclipse;

/* �Ʒ� java library�� file writing�� ���� �͵��� */
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
            // ���� ���� out.txt ��� ���Ͽ� numbering�̶�� �޼ҵ尡 ��ȯ�� ���� �����մϴ�.
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();        /* �����ϸ� �� ������Ʈ ��Ʈ ���丮�� out.txt ������ */
        } catch (IOException e) {
        	System.out.println(e.getMessage());
        } 
	}

}
