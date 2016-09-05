package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	char c;
	int value;
	boolean visisted= false;
	int data;
	Graph(int data){
		this.data=data;
	}
	Graph(char data){
		this.data=data;
	}
	List<Graph> neighbours = new ArrayList<>();
	
	public static Graph create(){
		Graph A = new Graph(0);
		A.value=0;
		Graph B = new Graph(1);
		B.value=1;
		Graph C = new Graph(7);
		C.value=7;
		Graph D = new Graph(2);
		D.value=2;
		Graph E = new Graph(8);
		E.value=8;
		Graph F = new Graph(6);
		F.value=6;
		Graph G = new Graph(3);
		G.value=3;
		Graph H = new Graph(5);
		H.value=5;
		Graph I = new Graph(4);
		I.value=4;
		
		A.neighbours.add(B);
		A.neighbours.add(C);
		B.neighbours.add(D);
		C.neighbours.add(F);
		D.neighbours.add(E);
		D.neighbours.add(G);
		F.neighbours.add(H);
		H.neighbours.add(I);
		return A;
	}

	public static Graph createCharGraph(){
		
		Graph A = new Graph(1);
		Graph B = new Graph(2);
		Graph C = new Graph(3);
		Graph D = new Graph(4);
		Graph E = new Graph(5);
		A.neighbours.add(B);
		A.neighbours.add(C);
		B.neighbours.add(D);
		B.neighbours.add(C);
		C.neighbours.add(E);
		return A;
		
	}
}

