
public class PrintAllNpr {

	public static void main(String[] args) {
		
		int arr[] = {1,  2,  3,4};
	    int r = 2;
	    int n = arr.length;
	    printPermutation(arr, n, r);
		
		
	}
	
	 // The main function that prints all Permutations of size r
	// in arr[] of size n. This function mainly uses PermutationUtil()
	static void printPermutation(int arr[], int n, int r)
	{
	    // A temporary array to store all Permutation one by one
	    int data[]=new int[r];
	 
	    // Print all Permutation using temprary array 'data[]'
	    permutationUtil(arr, data, 0,0, r);
	}
		
	/* arr[]  ---> Input Array
	   data[] ---> Temporary array to store current Permutation
	   start & end ---> Staring and Ending indexes in arr[]
	   index  ---> Current index in data[]
	   r ---> Size of a Permutation to be printed */
	static void permutationUtil(int arr[], int data[], int start,int next,  int r)
	{
	    // Current Permutation is ready to be printed, print it
	    if (start == r)
	    {
	        for (int j=0; j<r; j++){
	        	System.out.print(data[j]);
	        }
	        System.out.println();
	        return;
	    }
	 
	    // replace index with all possible elements. The condition
	    // "end-i+1 >= r-index" makes sure that including one element
	    // at index will make a Permutation with remaining elements
	    // at remaining positions
	    //for (int i=start; i<=end && end-i+1 >= r-index; i++)
	    for (int i=0,startcell=i,j=0;  i<r && j<r; i++)
	    {
	        data[startcell] = arr[j];
	       // swap(arr,r,start);
	        permutationUtil(arr, data, startcell+1,j+1, r);
	       // swap(arr,r,i);
	    }
	}
	
	static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i]=data[j];
		data[j]=temp;
 	}

}
