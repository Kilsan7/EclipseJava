/*********************************************************
 *
 *  String Array ������ Value Assign & ��� Test
 *  + for each ����
 *  
 *********************************************************/
package com.testproject.SmartCreative.eclipse;

public class HelloWorld {

	public static void main(String[] args) {

        String[] classGroup1 = { "������", "������", "���̶�", "�̰���" };
        String[] classGroup2 = new String[4];

        classGroup2[0] = "������";
        classGroup2[1] = "������";
        classGroup2[2] = "���̶�";
        classGroup2[3] = "�̰���";

        System.out.println("��а��� Hello World�� ��������!");
        System.out.println("�� ���� ����� ���ڿ� Array ���� Test");
        
        System.out.println("classGroup1.length = "+ classGroup1.length);
        System.out.println("classGroup2.length = "+ classGroup2.length);

        for (int i = 0; i < 4; i++) {
        	System.out.println("classGroup1�� ��� "+  Integer.toString(i + 1) + "��(��) : " + classGroup1[i]);
        }
        
        for (int i = 0; i < 4; i++) {
        	System.out.println("classGroup2�� ��� " + Integer.toString(i + 1) + "��(��) : " + classGroup2[i]);
        }

        System.out.println("for-each loop �׽�Ʈ");
        for (String strMem : classGroup1)
        	System.out.println("classGroup1�� ��� : " + strMem);
	}

	private static String String(int i) {

		return null;
		
	}

}
