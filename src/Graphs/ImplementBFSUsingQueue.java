package Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementBFSUsingQueue {

	public static void main(String[] args) {
		Graph start= Graph.create();
		bfs(start);
	}
	static void bfs(Graph start){
		Queue<Graph> queue = new LinkedList<>();
		queue.add(start);
		start.visisted=true;
		while(!queue.isEmpty()){
			Graph popped = queue.poll();
			System.out.println(popped.data);
			Iterator< Graph> itr = popped.neighbours.listIterator();
			while(itr.hasNext()){
				Graph n = itr.next();
				if(n.visisted==false){
					queue.add(n);
					n.visisted=true;
				}
			}
		}
	}
}
