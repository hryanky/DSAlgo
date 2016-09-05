package MultiThreading;

import java.util.LinkedList;
import java.util.Queue;

class Tasks implements Runnable{
	Thread t1 = new Thread();
	Queue<Integer> queue;
	public Tasks(Thread t1,Queue<Integer> queue) {
		this.t1=t1;
		this.queue=queue;
		
	}
	
	@Override
	public void run() {
		try {
			queue.remove();
			System.out.println("..");
			t1.sleep(100);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			queue.add((int) Math.random());
		}
		
	}
	
	
}

public class SingleThreadThreadpool extends Thread{
	
	public static void main(String[] args) {
		Thread t1 = null ;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add((int)Math.random());
		for(int i=0;i<10;i++){
			if(!queue.isEmpty()){
				
				System.out.println("started task");
				//new Thread(new Tasks(t1, queue));
				Tasks task = new Tasks(t1,queue);
				t1=new Thread(task);
				t1.start();
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Ended task");
	
				
			}
		}
		
	}

}
