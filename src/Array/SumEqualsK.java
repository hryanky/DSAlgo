/*Find if 2 elements in an unsorted array add up to 10*/
package Array;

public class SumEqualsK {

	public static void main(String[] args) {
		int arrayy [] = new int[3];
		arrayy[0]=2;
		arrayy[1]=1;
		System.out.println(arrayy[0]);
		System.out.println(arrayy[1]);
		System.out.println(arrayy[2]);
//		if(arrayy[0]==0){
//			
//			
//		}else{
//			System.out.println("hahaha");
//		}
		//int array[]={4,2,6,1,4};
		//sort in  n logn
		int array[]= {1,2,4,4,6};
		int i=0,j=array.length-1,k=8;
		while(i<j){
			if(array[i]+array[j]==k){
				System.out.println("Numbers are : "+array[i]+" and " + array[j]);
				break;
			}else if(array[i]+array[j]<k){
				 i++;
			}else if(array[i]+array[j]>k){
				j--;
			}
		}
		
		if(i>=j){
			System.out.println("No elements exists!");
		}
	}

}
