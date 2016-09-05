class Node{
	int data;
	Node(int data){
		this.data=data;
	}
	Node left;
	Node right;
}
public class LowestCommonAncestor {
	static int node1=40;
	static int node2=200;
	public static void main(String[] args) {
		Node A = new Node(100);
		Node B = new Node(50);
		Node C = new Node(200);
		Node D = new Node(40);
		Node E = new Node(75);
		A.left=B;
		B.left=D;
		B.right=E;
		A.right=C;
		lca(A);

	}
	
/*	node1
	node2
	root
	0===nothing found
	1===only one found
	2===both found
	3==tell the parent you are the one...occurs when node1/node2 is parent of the other!!
	*/

	static int lca(Node root){

	   boolean iAmTheOne=false;
	   
	   if(root.data==node1 || root.data==node2){
	     iAmTheOne=true;
	   }
	   
	   int left = lca(root.left);
	   if(left==2)
	     return 2;   //done

	   if(left==3) {
		   System.out.println(root.data );
		   return 2;}
	   
	   int right = lca(root.right);
	   if(right==2)
	     return 2; //done
	   
	   if(right==3) {System.out.println(root.data ); return 2;}
	   
	   
	     
	   if(left==1 && right==1)//Most Imp aahe he Piyu
	    {  
	       assert iAmTheOne==false;//if both are found in my subtrees.... I cant be the one :( ...unless tree is faulty!!! Ohh my god
	       System.out.println(root.data );// I am the lowest common ancestor
	       return 2;//let the parent....no further search is needed
	    }
	    else if(iAmTheOne==true)  
	   {
	     if(left==1 || right==1){
	       assert (left==1 && right==1) == false;      
	       return 3;  // tell the parent...you are the lca    
	     }
	     assert left == 0 && right == 0;
	     return 1;
	   }   
	  else if (left==0 && right==0)
	     return 0;
	  else if(left == 1 || right == 1)
	     return 1;
	     
	   assert false;//this line should never be called. Control reaching here is impossible  
	return right;
	 
	}

}
