package Tree;
import java.util.ArrayList;
import java.util.List;

import Tree.Tree;

public class LeastCommonAncestor {
	static int num1= 50,num2=500;
	static List<Integer> newlist1 = new ArrayList<>();
	static List<Integer> newlist2 = new ArrayList<>();
	static final List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		Tree tree = new Tree();
		
		ancestor(tree.createTree());
		int i = 0;
		if(newlist1.size()>=newlist2.size()){
			while(newlist2.size()>=i && newlist1.get(i)==newlist2.get(i)){
				i++;
				if(newlist2.size()==i){
					System.out.println(newlist1.get(i-1));
					break;
				}
			}
			//System.out.println(newlist1.get(i-1));
		}else if(newlist1.size()<newlist2.size()){
			
			while( newlist1.get(i)==newlist2.get(i)){
				i++;
				if(newlist1.size()==i){
					System.out.println(newlist2.get(i-1));
					break;
				}
			}
			
		}
			

//		if(newlist2.size()>=newlist1.size()){
//			
//			for( i=0;i<newlist1.size();i++){
//				if(newlist1.get(i)!=newlist2.get(i)){
//					System.out.println("COmmon ancestor is : "+ newlist1.get(i));
//					break;
//				} 
//			}
//			if(i==newlist1.size()){
//				System.out.println("COmmon ancestor is : "+ newlist2.get(i));
//				return;
//			}
//		}else{
//			for( i=0;i<newlist2.size();i++){
//				if(newlist2.get(i)!=newlist1.get(i)){
//					System.out.println("COmmon ancestor is : "+ newlist2.get(i));
//					break;
//				} 
//			}
//			if(i==newlist2.size()){
//				System.out.println("COmmon ancestor is : "+ newlist1.get(i));
//				return;
//			}
//			
//		}
	}

	static void ancestor(Tree root){
		
		if(root==null){
			return;
		}
		list.add(root.data);
		if(root.data==num1){
			//newlist1 = new ArrayList<>();
			newlist1.addAll(list);
		}
		if(root.data==num2){
			//newlist2 = new ArrayList<>();
			//for (int i = 0; i < list.size(); i++) {
				newlist2.addAll(list);
			//}
		}
		
		if(root.left!=null){
			ancestor(root.left);
		}
		if(root.right!=null){
			ancestor(root.right);
		}
		
		
		
	}
}
