package Tree;

public class CheckIfFullBinaryTree {
	static boolean ifFull=true;
	
	public static void main(String[] args) {
		Tree root = Tree.createFourthTree();
		boolean full = checkIfFull(root);
		System.out.println(full);
		
	}

	static boolean checkIfFull(Tree root){	
		
		if(!((root.left!=null && root.right!=null) || (root.left==null && root.right==null))){
			ifFull=false;
			return ifFull;
		}else{
			if(root.left!=null){
				checkIfFull(root.left);
			}
			if(root.right!=null){
				checkIfFull(root.right);
			}
			return ifFull;
		}
	}
}

// Java program to check if binay tree is complete or not
/*class Node {
 
    int data;
    Node left, right;
 
    Node(int item) {
        data = item;
        left = right = null;
    }
}
 
class CheckIfFullBinaryTree {
 
    static Node root;
     
    // this function checks if a binary tree is full or not 
    boolean isFullTree(Node node)
    {
        // if empty tree
        if(node == null)
        return true;
         
        // if leaf node
        if(node.left == null && node.right == null )
            return true;
         
        // if both left and right subtrees are not null
        // the are full
        if((node.left!=null) && (node.right!=null))
            return (isFullTree(node.left) && isFullTree(node.right));
         
        // if none work
        return false;
    }
 
     
    // Driver program
    public static void main(String args[]) {
        CheckIfFullBinaryTree tree = new CheckIfFullBinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        //tree.root.right = new Node(30);
       // tree.root.left.right = new Node(40);
        tree.root.left.left = new Node(50);
        //tree.root.right.left = new Node(60);
        tree.root.left.left.right = new Node(80);
        tree.root.left.left.right.left = new Node(70);
        tree.root.left.left.right.right = new Node(90);
         
        if(tree.isFullTree(root))
            System.out.print("The binary tree is full");
        else
            System.out.print("The binary tree is not full"); 
    }
}*/