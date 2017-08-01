/*
 * Nexus7ExampleThreadTest codes�� �� �ʿ��ϴ�.
 * ���� ���� Thread Class�� Extends�ϰ�(���) run method�� overriding�� ��
 * ������ object�� start method�� call�Ͽ� Thread�� Run ��Ų��.
 * 
 * SoloLearn�� ������
 * Runnable interface�� implementing�Ͽ� Thread�� �����ϴ� ����� �ణ �� ������ ���̳� �� ���� ���δٰ� �Ѵ�.
 * �ֳ��ϸ� �� ����� �ٸ� Ŭ�������� Thread Class�� extend�� �� �ְ� ���ֱ� �����̴�.
 * 
 * �ٽ��� Thread object�� ������ ��, Constructor�� Runnable class�� �Ѱ��ִ� ���̴�.
 */
class Loader implements Runnable {
    public void run() {
        System.out.println("Hello World!");
    }
}

public class MyClass {

	public static void main(String[] args) {
        Thread t = new Thread(new Loader());
        t.start();
	}

}
