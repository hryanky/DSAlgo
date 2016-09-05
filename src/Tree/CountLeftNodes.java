package Tree;

public class CountLeftNodes {
	static int count=0;
	public static void main(String[] args) {
		Tree root = Tree.createFourthTree();
		System.out.println(countLeft(root));
	}
	
	static int countLeft(Tree root){
		
		if(root==null){
			return 0;
		}
		if(root.right!=null){
			countLeft(root.right);
		}
		if(root.left!=null){
			count++;
			countLeft(root.left);
		}
		return count;
	}

}
