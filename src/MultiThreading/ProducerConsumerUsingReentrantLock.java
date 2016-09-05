/* Spon 30/30 producer consumer threads with shared array of 50*/
package MultiThreading;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//import org.apache.commons.lang.ArrayUtils;

public class ProducerConsumerUsingReentrantLock{
	//static int[] array = new int[50];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		Lock lock = new ReentrantLock();
		Condition listFull = lock.newCondition();
		Condition listEmpty = lock.newCondition();
		
		Producer produce = new Producer(list,lock,listFull,listEmpty);
		Consumer consume = new Consumer(list,lock,listFull,listEmpty);
		Thread t1 = null;
		Thread t2 = null;
		for (int i = 0; i < 30; i++) {
			t1 = new Thread(produce);
			t2 = new Thread(consume);
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}

class Producer implements Runnable{
	Lock lock;
	Condition listFull;
	Condition listEmpty;
	int[] array;
	List<Integer> list;
	public Producer(List<Integer> list,Lock lock, Condition listFull,	Condition listEmpty) {
		this.lock=lock;
		this.listEmpty=listEmpty;
		this.listFull=listFull;
		this.list=list;
	}
	@Override
	public void run() {
		lock.lock();
		System.out.println("Acquired lock by producer");
		try{
			while(list.size()>=50){
				try {
					System.out.println("waiting for consumer to consume " + list.size());
					listEmpty.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Adding element by producer " + list.size());
			//array[array.length]=(int) Math.random();
			list.add((int) Math.random());
			listFull.signal();
			System.out.println("notified consumer "+ list.size() );
		}finally{
			lock.unlock();
			System.out.println("Released lock by producer");
		}
	}
	
}

class Consumer implements Runnable{
	Lock lock;
	Condition listFull;
	Condition listEmpty;
	int[] array;
	List<Integer> list;
	public Consumer(List<Integer> list,Lock lock, Condition listFull,	Condition listEmpty) {
		this.lock=lock;
		this.listEmpty=listEmpty;
		this.listFull=listFull;
		this.list=list;
	}
	@Override
	public void run() {
		lock.lock();
		System.out.println("Acquired lock by consumer " + list.size());
		try{
			while(list.size()==0){
				try {
					System.out.println("waiting for producer to produce " + list.size());
					listFull.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("deleting element by consumer");
			//ArrayUtils.remove(array, 2);
			list.remove(0);
			listEmpty.signal();
			System.out.println("notified producer " + list.size());
		}finally{
			lock.unlock();
			System.out.println("Released lock by consumer");
		}
	}
	
	
}