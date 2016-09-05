package Tree;

public class KthSmallestElement {
	static int K = 4,count=0;
	static Tree kthRoot=null;
	public static void main(String[] args) {
		Tree root = Tree.createThirdTree();
		Tree kthElement=kthSmallest(root);
		
		if(K>count){
			System.out.println("No such element");
		}else
			System.out.println(kthElement.data);
	}
	static Tree kthSmallest(Tree root){
		
		if(root.left!=null){
			
			kthSmallest(root.left);
		}
		count++;
		if(count==K){
			kthRoot=root;
			//System.out.println(root.data);
		}
		
		if(root.right!=null){
			kthSmallest(root.right);
		}
		return kthRoot;
		
	}
}
