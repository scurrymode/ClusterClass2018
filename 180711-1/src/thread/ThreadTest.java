package thread;

public class ThreadTest {
	MyThread thread;
	
	public ThreadTest() {
		// TODO Auto-generated constructor stub
		thread = new MyThread();
		thread.start();
		
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("¡Ù");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTest();

	}

}
