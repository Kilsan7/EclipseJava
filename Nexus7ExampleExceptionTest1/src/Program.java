import java.util.Scanner;

public class Program {

	static int div(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
    	
    	int res;
    	
    	//�� ���ڸ� ���� �޾Ƶ鿩 �������� �ϰ� ���� ȭ�鿡 ����Ѵ�.
    	System.out.println("Please input two numbers seperately!");
    	Scanner myVar1 = new Scanner(System.in);
    	Scanner myVar2 = new Scanner(System.in);
    	
    	res = div(myVar1.nextInt(), myVar2.nextInt());

    	System.out.println("Divided Value(Quotient) : " + res);

    	System.out.println("Now let's test exceptions!");
        try {
            int a[ ] = new int[2];
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    	
    }

}
