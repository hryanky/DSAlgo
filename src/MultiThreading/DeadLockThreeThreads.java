package MultiThreading;
public class DeadLockThreeThreads {
	 
	public static void main(String[] args) {
		System.out.println("..");
		Object objLock1 = new Object();
		 Object objLock2 = new Object();
		 Object objLock3 = new Object();
//		DeadLockThread1 t1 = new DeadLockThread1(objLock1);
//		DeadLockThread2 t2 = new DeadLockThread2(objLock2);
//		DeadLockThread3 t3 = new DeadLockThread3(objLock3);
//		t1.start();
//		t2.start();
//		t3.start();
//		try {
//			t1.join();
//			t2.join();
//			t3.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}

/*class DeadLockThread1 extends Thread{
	Object obj;
	 DeadLockThread1(Object obj) {
		this.obj = obj;
	}
	public void run(){
		synchronized (obj) {
			try {
				System.out.println("Acquired lock1.. ");
				this.sleep(10000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("waiting for lock2.. ");
			synchronized (new DeadLockThread2(obj)) {
				
			}
		}
		
		System.out.println("Thread1 ended.. ");
	}
}
class DeadLockThread2 extends Thread{
	Object obj;
	 DeadLockThread2(Object obj) {
		this.obj = obj;
	}
	public void run(){
		synchronized (obj) {
			try {
				System.out.println("Acquired lock2.. ");
				this.sleep(10000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("waiting for lock3.. ");
			synchronized (new DeadLockThread3(obj)) {
				//System.out.println("waiting for lock3.. ");
			}
		}
		
		System.out.println("Thread2 ended.. ");
	}
}
class DeadLockThread3 extends Thread{
	Object obj;
	 DeadLockThread3(Object obj) {
		this.obj = obj;
	}
	public void run(){
		synchronized (obj) {
			try {
				System.out.println("Acquired lock3.. ");
				this.sleep(10000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("waiting for lock1.. ");
			synchronized (new DeadLockThread1(obj)) {
				//System.out.println("waiting for lock1.. ");
			}
		}
		
		System.out.println("Thread3 ended.. ");
	}
}
*/
