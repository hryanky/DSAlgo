package Dynamic;

public class MinimumNumOfSteps {

	public static void main(String[] args) {
		int arr[] = {3, 3, 5, 8, 2, 2, 5, 7, 6, 8, 9};
		int i=0,count=1;
		
		for(int k=0;k<arr[k];k++){
			for(int l=k+1;l<arr[l];l++){
				if(arr[k+1]+arr[l]<arr.length){
					
				}
			}
		}
		
		
		while(i<arr.length){
			for(int j=0;j<arr[i];j++){
				i++;
				if(i>=arr.length){
					break;
				}
			}
			count++;
		}
		System.out.println(count);
		
//		for(int i=0;i<arr.length;i++){
//			while (i<arr.length) {
//				int j = 0;
//				while (j < arr[i]) {
//					i++;
//				} 
//			}
//		}
	}

}
