// bfs using queue
package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Practice {
	static Queue<Graph> queue = new LinkedList<>();
	public static void main(String[] args) {
		//Graph start = Graph.createCharGraph();
		Graph start = Graph.create();
		bfs(start);
	}

	static void bfs(Graph startNode){
		System.out.println(startNode.data);
		//startNode.visisted=true;
		for(int i=0;i<startNode.neighbours.size();i++){
			if (startNode.neighbours.get(i).visisted==false) {
				queue.add(startNode.neighbours.get(i));
				startNode.neighbours.get(i).visisted=true;
			}
		}
		if(!queue.isEmpty()){
			startNode=queue.poll();
			bfs(startNode);
		}
	}
}
