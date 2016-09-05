package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {
static List<Graph > list = new ArrayList<Graph>();
static Stack<Graph> stack = new Stack<>();
	public static void main(String[] args) {
		Graph A = new Graph(10);
		Graph B = new Graph(20);
		Graph C = new Graph(30);
		Graph D = new Graph(50);
		Graph E = new Graph(70);
		Graph F = new Graph(80);
		Graph K = new Graph(60);
		Graph O = new Graph(40);
		Graph L = new Graph(90);
		A.neighbours.add(B);
		A.neighbours.add(C);
		B.neighbours.add(O);
		B.neighbours.add(D);
		C.neighbours.add(D);
		C.neighbours.add(K);
		F.neighbours.add(K);
		K.neighbours.add(E);
		O.neighbours.add(L);
		L.neighbours.add(E);
//		
		list.add(A);
		list.add(B);
		list.add(C);
		list.add(D);
		list.add(E);
		list.add(F);
		list.add(K);
		list.add(O);
		list.add(L);
		
		
		
		topologicalSort(A);

	}
	
	static void topologicalSort(Graph start){
		//boolean found=false;
		if(start==null){
			return;
		}
		while(start!=null || !list.isEmpty()){
			
			boolean found=false;
			if(start==null){
				start=list.remove(0);
			}
			if (start.visisted==false) {
				start.visisted = true;
				stack.push(start);
				list.remove(start);
			}
			for(int i=0;i<start.neighbours.size();i++){
				while(i<start.neighbours.size() &&  start.neighbours.get(i).visisted==false){
					start=start.neighbours.get(i);
					found=true;
				}
				
			}
			
			if(found == false && !stack.isEmpty()){
				start=stack.pop();
				System.out.println(start.data);
				if(!stack.isEmpty()){
					start=stack.peek();
				}else if(!list.isEmpty()){
					start=list.remove(0);
				}
				//continue;
			}
			
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop().data);
		}
	}

}
