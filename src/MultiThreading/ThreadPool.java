package MultiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable {
	int thread;
	public Worker(int i) {
		this.thread=i;
	}
	public void run() {
		System.out.println("Started working!!." + thread);
	}
}
public class ThreadPool extends Thread{

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 50; i++) {
			Worker worker = new Worker(i);
			executor.submit(worker);

		}
	}

}
