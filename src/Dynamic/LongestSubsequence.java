package Dynamic;

//package dynamicPragramming;

public class LongestSubsequence {

	public static void main(String[] args) {
		int array[]={10,1,3,-9,12,11,15};
		int longestsubsequence[]=new int[array.length];
		int previndex[] = new int[array.length];
		longestsubsequence[0]=1;
		previndex[0]=-1;
		int index=0,sublength=0;
		
		for(int i=1;i<array.length;i++){
			for(int j=0;j<i;j++){
				if(array[j]<array[i] && (longestsubsequence[j]>(longestsubsequence[i]-1))){
					longestsubsequence[i]=longestsubsequence[j]+1;
					previndex[i]=j;
				}else if(array[j]>array[i]){
					longestsubsequence[i]=1;
					previndex[i]=-1;
				}
			}
		}
			
		for(int i=0;i<longestsubsequence.length;i++){
			//System.out.println(longestsubsequence[i]);
			if(longestsubsequence[i]>sublength){
				sublength=longestsubsequence[i];
				index=i;
			}
		}
		
		while (index>-1) {
			System.out.println(array[index]);
			index = previndex[index];
		}
	

	}

}
