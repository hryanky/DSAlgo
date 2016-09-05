package SortingAlgorithms;

public class Quicksort {

	public static void main(String[] args) {
		int [] array ={5,2,3,1,8,7,0};
		partition(array,0,array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

	static void partition(int[] array,int start,int last){
		//int pivot = (start+last)/2;
		
		if(start<last){
			int index = quicksort(array, start, last);
			partition(array, start, index-1);
			partition(array, index+1, last);
		}
		
	}
	
	static int quicksort(int array[],int start, int last){
		int pivot = (start+last)/2;
		while(start<last){
			while(array[start]<array[pivot]){
				start++;
			}
			while(array[pivot]<array[last]){
				last--;
			}
			if(array[start]>array[last]){
				int temp = array[start];
				array[start]=array[last];
				array[last]=temp;
			}
			start++;
			last--;
		}
		return start;
	}
	
}
