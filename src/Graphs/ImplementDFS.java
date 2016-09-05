package Graphs;

public class ImplementDFS {

	public static void main(String[] args) {
		Graph start = Graph.create();
		dfs(start);
	}

	static void dfs(Graph start){
		System.out.println(start.data);
		start.visisted=true;
		for(int i = 0; i< start.neighbours.size();i++){
			while(start.neighbours.get(i).visisted==false){
				dfs(start.neighbours.get(i));
			}
		}
	}
}
