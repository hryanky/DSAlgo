
public class npr {
	static int num[] = {1,2,3};
	static int[] newnum = new int[num.length];
	public static void main(String[] args) {
		int n=3,r=3;
		npr(0,num.length,r);
	}

	static void npr(int start,int length,int r){
		if(r==0){
			print();
		}
		for(int i=start;i<length;i++){
			newnum[start]=num[i];
			npr(start+1, length,r-1);
		}
	}
	
	static void print(){
		for(int i=0;i<newnum.length;i++){
			System.out.print(newnum[i]);
		}
		System.out.println();
	}
}
