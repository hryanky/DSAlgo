package Tree;
class Node{
	 char id ;
	 String name;
	 String designation;
	 char parent;
	 Node[] children = new Node[10];
	 // boolean visited=false;
	Node(char id,String name, String designation,char parent,Node[] children){
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.parent=parent;
		this.children=children;
		//this.visited=false;
	}
}
public class NaryTreeTraversal {

	public static void main(String[] args) {
		//Node children[];
		Node D = new Node('D',"D","E1",'B',new Node[]{});
		Node E = new Node('E',"E","E2",'B',new Node[]{});
		Node F = new Node('F',"F","E3",'B',new Node[]{});
		Node G = new Node('G',"G","E4",'C',new Node[]{});
		Node H = new Node('H',"H","E5",'C',new Node[]{});
		Node B = new Node('B',"Mayu","CTO",'A',new Node[]{D,E,F});
		Node C = new Node('C',"Piyu","VP",'A',new Node[]{G,H});
		Node A = new Node('A',"Jon","CEO",'\0',new Node[]{B,C});
		
		
		
		System.out.println(B.children[1]);
		traverse(A);
	}

	static void traverse(Node root){
		System.out.println(root.id);
		for(int i=0;i<root.children.length;i++){
			//System.out.println(root.children[i].id);
			traverse(root.children[i]);
		}
	}
}
