package Tree;
import Tree.Tree;

public class ArrayRepresentsPreOrderBST {
	static int input[] = {40, 30, 35, 20, 80, 100};
	static int length=input.length;
	static boolean val=true;
	public static void main(String[] args) {
		System.out.println(check(0,null,null,null)); 
	}

	static boolean check(int position,String branch,Tree parent,Tree nextParent){
		
		if(position==length-1){
			return val;
		}
		
		if(branch==null){
			if(input[position+1]>input[position]){
				branch="right";
			}else branch="left";
			parent=new Tree(input[position]);
			check(position+1, branch,parent,null);
		}
		if(branch == "right"){
			if(input[position+1]>input[position]){
				branch="right";
			}else if(input[position+1]<input[position] && input[position+1]>parent.data){
				branch="left";
			}else{
				val=false;
			}			
			nextParent=parent;
			parent=new Tree(input[position]);
			check(position+1, branch,parent,nextParent);
		}
		if(branch == "left"){
			if(input[position+1]<input[position]){
				branch="left";
			}else if(input[position+1]>input[position] && input[position+1]<parent.data){
				branch="right";
			}else{
				val=false;
			}			
			nextParent=parent;
			parent=new Tree(input[position]);
			check(position+1, branch,parent,nextParent);
		}
		
		return val;
	}
}
