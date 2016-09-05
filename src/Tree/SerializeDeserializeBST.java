package Tree;

public class SerializeDeserializeBST {
	static int N=7;
	static int[] array  = new int[N];
	static int i=0,j=0;
	static Tree firstNode;
	public static void main(String[] args) {
		Tree root = Tree.createBSTTree();
		int a[]=serialize(root);
		System.out.println("Serialize data is : ");
		for(int i=0;i<N;i++){
			System.out.println(array[i]);
		}
		
		System.out.println("Deserialized data is : ");
		Tree n = new Tree(array[j]);
		deserialize(array, n);
		display(n);
		
	}

	static int[] serialize(Tree root){
		array[i]=root.data;i++;
		if(root.left!=null){
			serialize(root.left);
		}
		if(root.right!=null){
			serialize(root.right);
		}
		return array;
	}
	
	static void deserialize(int[] array,Tree root){
		int i=1;
		while(i<array.length && array[i]<root.data){
			i++;
		}
		int[] array1 = new int[i-1];
		int[] array2 = new int[array.length-(i)];
		for(int k=0;k<array1.length;k++){
			array1[k]=array[k+1];
		}
		for(int k=0;k<array2.length;k++,i++){
			array2[k]=array[i];
		}
		if(array1.length>=1){
			root.left=new Tree(array1[0]); 
		}
		if(array2.length>=1){
			root.right=new Tree(array2[0]);
		}
		if(array1.length>1){
		deserialize(array1,root.left);
		}
		if(array2.length>1){		
		deserialize(array2,root.right);
		}		
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
