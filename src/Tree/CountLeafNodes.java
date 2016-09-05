/*A node is a leaf node if both left and right child nodes of it are NULL.

*/
package Tree;

public class CountLeafNodes {
	
	static int count=0;
	public static void main(String[] args) {
		Tree root = Tree.createFourthTree();
		System.out.println(countLeafNode(root));
		
	}

	static int countLeafNode(Tree root){
		if(root==null){
			return 0;
		}
		if(root.left==null && root.right==null){
			return 1;
		}
		
		return (countLeafNode(root.left)+countLeafNode(root.right));
	}
	
	
}
