package MultiThreading;
class ThreadDemo1 extends RaceCondition{
	public void run(){
		//synchronized (lock) {
			for (int i = 0; i < 10000; i++) {
				count=i;
			}
		//}
	}
}
class ThreadDemo2 extends RaceCondition{
	public void run(){
		//synchronized (lock) {
			for (int i = 10000; i < 20000; i++) {
				count=i;
			}
		//}
	}
}
public class RaceCondition extends Thread{
	 static long count = 0;
	static Object lock =new Object();
	public static void main(String[] args) {
		for (int i = 0; i < 500000; i++) {
			ThreadDemo1 t1 = new ThreadDemo1();
			ThreadDemo2 t2 = new ThreadDemo2();
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
			//assert count == 19999l || count == 9999l;

		}
		
		
		System.out.println(count);
	}
	
}
