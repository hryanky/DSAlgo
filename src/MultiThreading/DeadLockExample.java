package MultiThreading;

class Thread1 extends DeadLockExample{

	

	public void run(){
		
		synchronized (objlock1) {
			try {
				this.sleep(1000);
				System.out.println("Acquired t1");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Waiting for t2");
			synchronized (objlock2) {
				
			}
		}

	}
}

class Thread2 extends DeadLockExample{	


	public void run(){
		synchronized (objlock2) {
			try {
				this.sleep(1000);
				System.out.println(" acquired t2");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("waiting for t1");
			synchronized (objlock1) {
				
			}
		}

	}
}

public class DeadLockExample extends Thread{
	static Object objlock1 = new Object();
	static Object objlock2 = new Object();
	
	public static void main(String[] args) {
		//DeadLockExample thread1 = new DeadLockExample();
		//DeadLockExample thread2 = new DeadLockExample();
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
//		DeadLockExample obj1 = new DeadLockExample(t1);
//		DeadLockExample obj2 = new DeadLockExample(t2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		thread1.start();
//		thread2.start();
	}

//	public void run(){
//		method2();
//		method1();
//	}
//	
//	static void method1(){
//		
//		synchronized (objlock1) {
//			System.out.println("Lock 1 acquired.");
//		}
//		synchronized (objlock2) {
//			System.out.println("Lock 2 acquired.");
//		}
//	}
//	
//	static void method2(){
//		synchronized (objlock2) {
//			System.out.println("Lock 2 acquired.");
//		}
//		synchronized (objlock1) {
//			System.out.println("Lock 1 acquired.");
//		}
//	}
}
