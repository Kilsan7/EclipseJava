/**********************************************************
 * 
 * User의 입력값을 받아서 출력하는 프로그램
 * Scanner 객체를 이용함
 * java.util.Scanner Class를 import시켜야 함
 * 
 *********************************************************/
import java.util.Scanner;;
public class DisplayUserInputText {

	public static void main(String[] args) {
		
		System.out.println("Input string please!");
        Scanner myVar = new Scanner(System.in);
        System.out.println(myVar.nextLine());
        
	}

}
