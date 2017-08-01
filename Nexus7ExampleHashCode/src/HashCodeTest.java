/*************
 * Hash Code�� 
 * �ش� ��ü�� ������ ���� return�� �ִµ� ���˴ϴ�.
 * Java Application �� �����ϸ�, ������ �̸��� ��ü�� ���� �� ������ �� �ֽ��ϴ�. �� ��ü���� �̸��� ���� ��, �ʱ�ȭ�� ���� ���� �ٸ� ������ ���� ��ü���� �Ǵ� ���Դϴ�.
 * �̷� ��ü�� �����ϱ� ����, ������ ���������� ��½����ִ� �޼ҵ尡 �ٷ� hashCode()�Դϴ�. �Ϲ�������, �̰��� ��ü�� ���� �ּҸ� �������� ��ȯ�ϴ� ���·� �����˴ϴ�. (This is typically implemented by converting the internal address of the object into an integer. ����. Java SE7 API)
 * �츮�� ���� ��ü ���� ������ ����� ��, ��µǴ� Reference Address�� �ٷ� �� hashCode�� 16������ ����� ���Դϴ�.
 * 
 */
public class HashCodeTest {

	public static void main(String[] args) { 

	       Object obj = new Object(); 

          //obj ��ü�� �ּҰ��� ��� 
	      System.out.println("obj�� ȭ�� ����ϸ� -> Reference ��, ��ü�� ���� �ּҰ� ������.");
		  System.out.println(obj); 

		  //obj ��ü�� ������ hashcode�� ��� 
		  System.out.println("HashCode�� ȭ�� ����ϸ� -> �� �ּ��� Integer ���� ��µȴ�.");
		  System.out.println(obj.hashCode()); 

		 //obj ��ü�� hashcode�� 16������ ��� 
		  System.out.println("HashCode�� 16������ ��ȭ�ϸ�  -> ù ��° ��µ���Ÿ�� Object ������ ���� �ּҿ� ����.");
		  System.out.println(Integer.toHexString(obj.hashCode())); 

	 } 

}