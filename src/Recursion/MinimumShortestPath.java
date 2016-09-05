package Recursion;

public class MinimumShortestPath {
	static int count=0;
	public static void main(String[] args) {
		int[] array={2,2,1,2,9,1,1,1,1,1,1};
		minPath(array,0);
	}

	static int minPath(int[] array,int i){
		count++;
		if(i>=array.length){
			System.out.println(count);
			return count;
		}else{
			if(array[i]==1){
				
				minPath(array, i+1);
			}
			int temp=i+1,ipass=0;
			if(array[i]>=array.length-i){
				return count;
			}else{
				for(int j=0;j<array[i] && j<array.length-i-1;j++){
					if(array[temp]>=array[temp+1]){
						ipass=temp;
					}else{
						ipass=temp+1;
					}
				}
				
				minPath(array, ipass);
			}
		}
		return count;
	}
}
