///*Given a binary tree, find its minimum depth. 
// * The minimum depth is the number of nodes along the shortest path from root node down to the nearest leaf node.
//*/
//package Tree;
//
//public class MinimumDepth {
//	static int finalDepth = 999 ,prevlevel=0,prevfinal=-1,count=0;
//	static int minDepth=999;
//	public static void main(String[] args) {
//		Tree A =new Tree(100);
//		Tree B =new Tree(50);
//		Tree C =new Tree(200);
//		Tree D =new Tree(10);
//		Tree E =new Tree(20);
//		Tree F =new Tree(20);
//		Tree G =new Tree(230);
//		Tree H =new Tree(230);
//		A.left=B;
//		A.right=H;
//		B.left=D;
//		D.left=E;
//		E.right=C;
//		C.left=F;
//		//H.right=G;
//		System.out.println(minDepth(A,1));
//		System.out.println("count : "+count);
//	}
//
//	static int minDepth(Tree root,int depth){
////		if(root==null){
////			return 0;
////		}
////		
////		if(depth>finalDepth){
////			return depth;
////		}
////		//count++;
////		if(root.left==null && root.right==null && finalDepth>depth){
////			finalDepth=depth;
////		}
////		if(root.right!=null){		
////			minDepth(root.right,depth+1);
////		}
////		
////		if(root.left!=null){			
////			minDepth(root.left,depth+1);
////		}
////		
//		if(root.left==null && root.right==null){
//			if(minDepth>depth){
//				finalDepth=depth;
//			}
//		}
////		if(prevlevel<depth){
////			prevlevel=depth;
////		}
//		if(root.left!=null){
//			minDepth(root.left, depth+1);
//		}
//		if(root.right!=null){
//			minDepth(root.right, depth+1);
//		}
//		return finalDepth;
//
//	}
//}


package Tree;

public class MinimumDepth {
	//static Tree cloneRoot;
	public static void main(String[] args) {
		Tree A= new Tree(100);
		Tree B= new Tree(70);
		Tree C= new Tree(700);
		Tree D= new Tree(60);
		Tree E= new Tree(500);
		Tree F= new Tree(40);
		Tree G= new Tree(50);
		Tree H= new Tree(625);
		Tree I= new Tree(10);
		Tree J= new Tree(650);
		Tree K= new Tree(20);
		A.left=B;
		A.right=C;
		B.left=D;
		D.left=F;
		D.right=G;
		G.left=I;
		I.right=K;
		C.left=E;
		E.right=H;
		H.right=J;
		//cloneRoot=A;
		System.out.println("Original Tree : ");
		display(A);
		Tree clonedRoot = clone(A,null,null);
		System.out.println("\nCloned Tree : ");
		//display(clonedRoot);
		
		Tree myCloneRoot = myClone(A);
		display(myCloneRoot);
		
	}
	
	static Tree clone(Tree root,Tree prevRootNode,String node){
		Tree cloneRoot = null;
		if(root!=null){
			cloneRoot = new Tree(root.data);
		}
		if(prevRootNode!=null && node == "left"){
			prevRootNode.left=cloneRoot;
		}
		if(prevRootNode!=null && node == "right"){
			prevRootNode.right=cloneRoot;
		}
		if(root.left!=null){
			clone(root.left,cloneRoot,"left");
		}
		if(root.right!=null){
			clone(root.right,cloneRoot,"right");
		}
		
		return cloneRoot;
	}

	
	
	static Tree myClone(Tree root){
		Tree newRoot=null;
		if(root!=null){
			newRoot = new Tree(root.data);
			newRoot.left = myClone(root.left);
			newRoot.right = myClone(root.right);
		}		
		return newRoot;
	}
	static void display(Tree root){
		System.out.println(root.data);
		if(root.left!=null){
			
			display(root.left);
		}
		if(root.right!=null){
			
			display(root.right);
		}
	}
	
}
