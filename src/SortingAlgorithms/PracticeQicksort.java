package SortingAlgorithms;

public class PracticeQicksort {
	//static int[] array = {8,5,1,-3,0,-9};
	
	
	
	public static void main(String[] args) {
		int[] array = {-5,4,3,2,2,2,1};
		int[] newarr=quicksort(array);
		int[] a = arrange(array);
//		for(int l=0;l<newarr.length;l++){
//			System.out.println(newarr[l]);
//		}
		for(int l=0;l<a.length;l++){
			System.out.println(a[l]);
		}
	}

	static int[] quicksort(int[] array){
		//System.out.println(array.length);
		int i= 0,j=array.length-1;
		if(i>=j){
			return array;
		}
		//int[] newarr = null ;
		int[] newarr = new int[array.length];
		//newarr = new int[(j-i)+1];
		int pivot = ((i+j)/2), a=0, b=newarr.length-1;
		
		while(i<=j){				
			if(array[i]<=array[pivot] && i!=pivot){
				newarr[a]=array[i];
				a++;
			}else if(array[i]>array[pivot]){
				newarr[b]=array[i];
				b--;
			}
			i++;
		}
		
		assert a==b;// && (a-1)==pivot;
		
		newarr[a]=array[pivot];
		int []  newarr1 = new int[a];
		int []  newarr2 = new int[newarr.length-(a+1)];
		for(int l=0;l<a;l++){
			newarr1[l]=newarr[l];
		}
		//newarr1[a]=array[pivot];
		for(int l=a+1,k=0;l<newarr.length;l++,k++){
			newarr2[k]=newarr[l];
		}
		newarr1=quicksort( newarr1);
		newarr2=quicksort( newarr2);
		int u=0;
		for(;u<(newarr1.length);u++){
			newarr[u]=newarr1[u];
		}
		newarr[u]=array[pivot];u++;
		for(int v=0;v<(newarr2.length);u++,v++){
			newarr[u]=newarr2[v];
		}
		return newarr;
	}
	
	static int[] arrange(int[] array){
		
		int p = (array.length-1)/2,i=0,a=0,b=array.length-1,j=array.length-1;
		while(i<b){
			if(array[i]<array[p] && i!=p){
				array[a]=array[i];
				a++;i++;
			}else if(array[i]>array[p]){
				int temp=array[b];
				array[b]=array[i];
				array[i]=temp;
				b--;
			}else{
				i++;
			}
		}
		return array;
	}
}
