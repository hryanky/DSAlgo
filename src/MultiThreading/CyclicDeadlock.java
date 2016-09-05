package MultiThreading;

public class CyclicDeadlock {

	public static void main(String[] args) {
		System.out.println("..");
		Object objLock1 = new Object();
		 Object objLock2 = new Object();
		 Object objLock3 = new Object();
		DeadLockThread1 t1 = new DeadLockThread1(objLock1,objLock2);
		DeadLockThread2 t2 = new DeadLockThread2(objLock2,objLock3);
		DeadLockThread3 t3 = new DeadLockThread3(objLock3,objLock1);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class DeadLockThread1 extends Thread{
	Object obj1;
	Object obj2;
	 DeadLockThread1(Object obj1,Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void run(){
		synchronized (obj1) {
			try {
				System.out.println("Acquired lock1.. ");
				this.sleep(10000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("waiting for lock2.. ");
			synchronized ( obj2) {
				System.out.println("waited and acquired  lock2.. ");
			}
		}
		
		System.out.println("Thread1 ended.. ");
	}
	
}
class DeadLockThread2 extends Thread{
	Object obj2;
	Object obj3;
	 DeadLockThread2(Object obj2,Object obj3) {
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	public void run(){
		synchronized (obj2) {
			try {
				System.out.println("Acquired lock2.. ");
				this.sleep(10000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("waiting for lock3.. ");
			synchronized (obj3) {
				//System.out.println("waiting for lock3.. ");
			}
		}
		
		System.out.println("Thread2 ended.. ");
	}
}
class DeadLockThread3 extends Thread{
	Object obj3;
	Object obj1;
	 DeadLockThread3(Object obj3,Object obj1) {
		this.obj3 = obj3;
		this.obj1=obj1;
	}
	public void run(){
		synchronized (obj3) {
			try {
				System.out.println("Acquired lock3.. ");
				this.sleep(10000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("waiting for lock1.. ");
			synchronized (obj1) {
				//System.out.println("waiting for lock1.. ");
			}
		}
		
		System.out.println("Thread3 ended.. ");
	}
}


