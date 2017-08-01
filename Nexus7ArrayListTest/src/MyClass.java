/**********************************************************************************
 *
 * Sololearn ���� ����
 * ArrayList�� Groups of objects�� �����ϰ� �ٷ�� �� ������ Class��.
 * add(), remove(), contains(), get(int index), size(), clear() ���� Method Ȱ�� ����
 * (2017.7.10 ����) 
 * 
 **********************************************************************************/
import java.util.ArrayList;

public class MyClass {

	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.remove("Green");
        
        System.out.println(colors);
        System.out.println("get method ��� : " + colors.get(2));  //get(int index)
        System.out.println("size method ��� : " + colors.size());
        System.out.println("contains method�� \"Blue �˻�\" ��� : " + colors.contains("Blue") + "\n");  //contains(o)

        //�߰� Test �̰� http://beginnersbook.com/2013/12/java-arraylist-contains-method-example/���� ��������
        System.out.println("http://beginnersbook.com/2013/12/java-arraylist-contains-method-example/���� ��������");
        ArrayList<String> al = new ArrayList<String>();
        al.add("pen");
        al.add("pencil");
        al.add("ink");
        al.add("notebook");

        System.out.println("ArrayList contains the string 'ink pen': "
                                             +al.contains("ink pen"));
        System.out.println("ArrayList contains the string 'pen': "
                                               +al.contains("pen"));
        System.out.println("ArrayList contains the string 'pencil': "
                                            +al.contains("pencil"));
        System.out.println("ArrayList contains the string 'book': "
                                             +al.contains("book") + "\n");

        System.out.println("Array List���� contains method�� �̿��� ���� �˻� ���");
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(1);
        al2.add(99);
        al2.add(56);
        al2.add(13);
        al2.add(44);
        al2.add(6); 
        
        System.out.println("'1' is present in arraylist: "+al2.contains(1));
        System.out.println("'55' is present in arraylist: "+al2.contains(55));
        System.out.println("'44' is there in arraylist: "+al2.contains(44));
        System.out.println("'7' is there in arraylist: "+al2.contains(7));
        
	}
}
