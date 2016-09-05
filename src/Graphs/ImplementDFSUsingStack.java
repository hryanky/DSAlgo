package Graphs;

import java.util.Stack;

public class ImplementDFSUsingStack {
	static Stack<Graph> stack = new Stack<>();
	public static void main(String[] args) {
		Graph startNode = Graph.create();
		dfs(startNode);
	}

	static void dfs(Graph startNode){
		if(startNode==null){
			return;
		}
		while (startNode!=null) {
			System.out.println(startNode.data);
			startNode.visisted = true;
			for (int i = 0; i < startNode.neighbours.size(); i++) {
				if (startNode.neighbours.get(i).visisted == false) {
					stack.push(startNode.neighbours.get(i));
				}
			}
			if (!stack.isEmpty()) {
				startNode = stack.pop();
				//dfs(stack.pop());
			}else return; 
		}
	}
}
