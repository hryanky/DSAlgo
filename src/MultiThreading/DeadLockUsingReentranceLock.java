package MultiThreading;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class T1 extends Thread{
	Lock lock1 = new ReentrantLock();
	Lock lock2 = new ReentrantLock();
	T1(Lock lock1,Lock lock2){
		this.lock1=lock1;
		this.lock2=lock2;
	}
	public void run() {
		System.out.println("t1 acquiring lock1");
		lock1.lock();
		
		System.out.println("lock1 acquired by t1");
		
		System.out.println("t1 acquiring lock2");
		try {
			this.sleep(1000);
			lock2.lock();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock1.unlock();
			lock2.unlock();
		}	
		System.out.println("t1 block finished");
	}
	
}

class T2 extends Thread{
	Lock lock2 = new ReentrantLock();
	Lock lock3 = new ReentrantLock();
	T2(Lock lock2,Lock lock3){
		this.lock2=lock2;
		this.lock3=lock3;
	}
	public void run() {
		System.out.println("t2 acquiring lock2");
		lock2.lock();
		
		System.out.println("lock2 acquired by t2");
		
		System.out.println("t2 acquiring lock3");
		try {
			this.sleep(1000);
			lock3.lock();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock3.unlock();
			lock2.unlock();
		}	
		System.out.println("t2 block finished");
	}
}

class T3 extends Thread{
	Lock lock1 = new ReentrantLock();
	Lock lock3 = new ReentrantLock();
	T3(Lock lock1,Lock lock3){
		this.lock1=lock1;
		this.lock3=lock3;
	}
	public void run() {
		System.out.println("t3 acquiring lock3");
		lock3.lock();
		
		System.out.println("lock3 acquired by t3");
		
		System.out.println("t1 acquiring lock1");
		try {
			this.sleep(1000);
			lock1.lock();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock1.unlock();
			lock3.unlock();
		}	
		System.out.println("t3 block finished");
	}
}

public class DeadLockUsingReentranceLock {

	public static void main(String[] args) {

     	Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		Lock lock3 = new ReentrantLock();
		
		T1 t1 = new T1(lock1,lock2);
		T2 t2 = new T2(lock2,lock3);
		T3 t3 = new T3(lock1,lock3);

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
