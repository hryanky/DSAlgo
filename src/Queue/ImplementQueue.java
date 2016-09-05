package Queue;

import java.util.Scanner;
import java.util.Stack;

public class ImplementQueue {
	static Stack<Integer> stack1 =new Stack<>();
	static Stack<Integer> stack2 =new Stack<>();
	public static void main(String[] args) {
		
		System.out.println("Please enter the element");
		for(int i=0;i<4;i++){
			Scanner scan = new Scanner(System.in);
			enqueue(scan.nextInt());
		}
		int popped = 0;
		for (int i = 0; i < 4; i++) {
			popped = dequeue();
			System.out.println(popped);
		}
		
	}

	static void enqueue(int element){
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		stack1.push(element);
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
	}
	
	static int dequeue(){
		if(!stack1.isEmpty()){
			return stack1.pop();
		}else return -1;
	}
}
