package Recursion;

import java.util.Stack;

public class ReverseStack {
	//static Stack<Integer> reverseStack = new Stack<>();
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
//		while(!stack.isEmpty()){
//			System.out.println(stack.pop());
//		}
		reverse(stack,0);
		while(!stack.isEmpty()){
		System.out.println(stack.pop());
	}
	}

	static void reverse(Stack stack,int temp){
		///Stack<Integer> reverseStack = new Stack<>();
		if(!stack.isEmpty()){
			 temp = (int) stack.pop();
			 reverse(stack, temp);
//			 if(stack.isEmpty()){
//					stack.push(temp);
//				}else
				 insertBottom(stack,temp);
		}
	}
	static void insertBottom(Stack stack,int temp){
		if(stack.isEmpty()){
			stack.push(temp);
		}
		else{
		//if(!stack.isEmpty()){
			int temp2 = (int) stack.pop();
			insertBottom(stack,temp);
			stack.push(temp2);
		}
	}
}
