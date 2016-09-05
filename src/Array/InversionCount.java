package Array;

public class InversionCount {
		//static int[] finalArr =null;
		static int inversionCount=0;
		public static void main(String[] args) {
			//int [] array ={5,2,3,1,8,7,0};
			int [] array ={1,20,6,4,5};
			int a[]=mergesort(array);
			System.out.println("Inversion count is : " + inversionCount);
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
		}

		static int[] mergesort(int array[]){
			if(array.length==1 || array.length==0){
				return array;
			}
			int i=0;
			int arr1[] = new int[array.length/2];
			int arr2[] = new int[array.length-(array.length/2)];
			for( i=0;i<arr1.length;i++){
				arr1[i]=array[i];
			}
			//i++;
			for(int k=0;k<arr2.length;k++,i++){
				arr2[k]=array[i];
			}
			arr1 = mergesort(arr1);
			arr2 = mergesort(arr2);
			return merge(arr1,arr2);
		}
		
		static int[] merge(int arr1[],int arr2[]){
			int i=0,k=0,j=0;
			int finalArr[] = new int[arr1.length+arr2.length];
			while (arr1.length>i && arr2.length>j) {
				if (arr1[i] < arr2[j]) {
					finalArr[k] = arr1[i];
					//finalArr[k + 1] = arr2[i];
					i++;
					k++;
				}else if (arr1[i] > arr2[j]) {
					inversionCount+=(arr1.length-i);
					finalArr[k] = arr2[j];
					j++;
					k++;// = k + 2;
				} 
			}
			while(arr1.length>i){
				finalArr[k]=arr1[i];
				i++;k++;
				//inversionCount++;
			}
			while(arr2.length>j){
				finalArr[k]=arr2[j];
				j++;k++;
			}
			
			return finalArr;
		}
	


}
