package Graphs;

import java.util.ArrayList;
import java.util.List;

public class ShortestPaths {
	static int numberOfVertex=9;
	public static void main(String[] args) {
		Graph source = Graph.create();
		shortestPaths(source);
	}

	static void shortestPaths(Graph source){
		
		Graph[] spt=new Graph[numberOfVertex];
		List<Graph> list = new ArrayList<>();
		list.add(source);
		int i=0,k=0;
		while (source!=null && i<numberOfVertex) {
			int prevVal=999;
			spt[i] = source;
			list.remove(source);
			i++;
			for (int j = 0; j < source.neighbours.size(); j++) {
				list.add(source.neighbours.get(j));
				//k++;
			}
			for (int j = 0; j<list.size(); j++) {
				
				if (prevVal > list.get(j).value) {
					source = list.get(j);
					prevVal = list.get(j).value;
				}
			}
			
		}
		for(int j = 0; j < spt.length; j++){
			System.out.println("Distance of vertex " + spt[j].data + " is " + spt[j].value );
		}
		
	}
}
