package Array;

import SortingAlgorithms.Mergesort;

public class TwoNonRepeatingElements {

	public static void main(String[] args) {
		int array[]={1,3,12,3,4,2,1,4};
		int arr[] =Mergesort.mergesort(array);
		for(int i=0;i<array.length;i++){
			System.out.println(arr[i]);
		}
		int x=array[0];
		int y = array[1];
		for(int i=2;i<array.length-1;i++){
			if(array[i] == x){
				x=array[i+1];
			}
			if(array[i] == y){
				y=array[i+1];
			}
		}
		System.out.println("Non Repeating elements are : "+ x + " " + y);
	}

}
