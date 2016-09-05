package Dynamic;

public class FindTripletsSum {

	public static void main(String[] args) {
		int arr[] = {5, 1, 3, 4, 7};
		//sort
		//arr[]={};
		int sum=12,count=0;
		int i=0,j=i+1;
		for(i=0;i<arr.length-2;i++){
			int k=arr.length-1;
			for(j=i+1;j<k;k--){
				if(arr[i]+arr[j]+arr[k]<sum){
					count++;
					System.out.println(arr[i]+ " " + arr[j] + " "+ arr[k]);
					//k--;
				}
			}
		}
		System.out.println(count);
	}

}
