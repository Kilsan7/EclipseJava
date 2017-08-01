/*************
 * Hash Code는 
 * 해당 객체의 고유한 값을 return해 주는데 사용됩니다.
 * Java Application 을 실행하면, 동일한 이름의 객체가 여러 개 생성될 수 있습니다. 이 객체들은 이름만 같을 뿐, 초기화에 따라 서로 다른 성질을 가진 객체들이 되는 것입니다.
 * 이런 객체를 구별하기 위해, 고유한 정수값으로 출력시켜주는 메소드가 바로 hashCode()입니다. 일반적으로, 이것은 객체의 내부 주소를 정수값로 변환하는 형태로 구현됩니다. (This is typically implemented by converting the internal address of the object into an integer. 참고. Java SE7 API)
 * 우리가 보통 객체 참조 변수를 출력할 때, 출력되는 Reference Address는 바로 이 hashCode를 16진수로 출력한 값입니다.
 * 
 */
public class HashCodeTest {

	public static void main(String[] args) { 

	       Object obj = new Object(); 

          //obj 객체의 주소값을 출력 
	      System.out.println("obj를 화면 출력하면 -> Reference 즉, 객체의 내부 주소가 찍힌다.");
		  System.out.println(obj); 

		  //obj 객체의 고유한 hashcode를 출력 
		  System.out.println("HashCode를 화면 출력하면 -> 이 주소의 Integer 값이 출력된다.");
		  System.out.println(obj.hashCode()); 

		 //obj 객체의 hashcode를 16진수로 출력 
		  System.out.println("HashCode를 16진수로 변화하면  -> 첫 번째 출력데이타의 Object 다음에 나온 주소와 같다.");
		  System.out.println(Integer.toHexString(obj.hashCode())); 

	 } 

}