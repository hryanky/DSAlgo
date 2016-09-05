package Tree;

public class Tree {
	
	Tree left;
	Tree right;
	int data;
	public Tree(int data){
		this.data=data;
	}
	public Tree(){
		
	}
	public static Tree createTree(){
		Tree A =new Tree(100);
		Tree B =new Tree(50);
		Tree C =new Tree(30);
		Tree D =new Tree(40);
		Tree E =new Tree(20);
		Tree F =new Tree(25);
		Tree G =new Tree(29);
		Tree H =new Tree(500);
		A.left=B;
		A.right=H;
		B.left=D;
		D.left=E;
		E.right=C;
		C.left=F;
		F.right=G;
		
		Tree root = A;
		return root;
	}
	
	public static Tree createSecondTree(){
		Tree A =new Tree(20);
		Tree B =new Tree(8);
		Tree C =new Tree(22);
		Tree D =new Tree(4);
		Tree E =new Tree(12);
		Tree F =new Tree(10);
		Tree G =new Tree(14);
		//Tree H =new Tree(500);
		A.left=B;
		A.right=C;
		B.left=D;
		E.left=F;
		B.right=E;
		//C.left=F;
		E.right=G;
		
		Tree root = A;
		return root;
	}
	
	public static Tree createThirdTree(){
		Tree A =new Tree(20);
		Tree B =new Tree(8);
		Tree C =new Tree(22);
		Tree D =new Tree(4);
		Tree E =new Tree(2);
		Tree F =new Tree(1);
		Tree G =new Tree(3);
		Tree H =new Tree(0);
		A.left=B;
		A.right=C;
		B.left=D;
		E.left=F;
		F.left=H;
		D.left=E;
		//E.right=G;
		
		Tree root = A;
		return root;
	}
	
	public static Tree createFourthTree(){
		Tree A =new Tree(1);
		Tree B =new Tree(2);
		Tree C =new Tree(3);
		Tree D =new Tree(4);
		Tree E =new Tree(5);
		Tree F =new Tree(6);
		A.left=B;
		A.right=C;
		B.left=D;
		//B.right=E;
		//C.left=D;
		C.right=D;
		C.left=F;
//		D.right=F;
		F.left=E;
		
		Tree root = A;
		return root;
	}
	
	public static Tree createBSTTree(){
		Tree A =new Tree(10);
		Tree B =new Tree(5);
		Tree C =new Tree(40);
		Tree D =new Tree(1);
		Tree E =new Tree(7);
		Tree F =new Tree(50);
		Tree G =new Tree(45);
		A.left=B;
		A.right=C;
		B.left=D;
		B.right=E;
		C.right=F;
		F.left=G;
		Tree root = A;
		return root;
	}
	
}
