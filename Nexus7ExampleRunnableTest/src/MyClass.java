/*
 * Nexus7ExampleThreadTest codes와 비교 필요하다.
 * 위는 직접 Thread Class를 Extends하고(상속) run method를 overriding한 후
 * 생성한 object의 start method를 call하여 Thread를 Run 시킨다.
 * 
 * SoloLearn에 따르면
 * Runnable interface를 implementing하여 Thread를 생성하는 방법은 약간 더 복잡해 보이나 더 많이 쓰인다고 한다.
 * 왜냐하면 이 방법은 다른 클래스에서 Thread Class를 extend할 수 있게 해주기 때문이다.
 * 
 * 핵심은 Thread object를 생성할 때, Constructor에 Runnable class를 넘겨주는 것이다.
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
