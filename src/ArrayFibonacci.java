/*Write a function that takes a number n and returns an array containing a Fibonacci sequence of length n
*/
public class ArrayFibonacci {
	static int[] array;
	static int[] array1;
	public static void main(String[] args) {
		int N = 2;
		array=new int[N];
		 array1= new int[N];
		fib(N,0);
		fib(N);
		for(int i=0;i<array1.length;i++){
			System.out.println(array1[i]);
		}
	}

	static int[] fib(int n){
		if(n==0){
			return array1;
		}
		if(n==1){
			array1[0]=0;
			return array1;
		}
		array1[0]=0;
		array1[1]=1;
		for(int i=2;i<n;i++){
			array1[i]=array1[i-1]+array1[i-2];
		}
		return array1;
	}
	static int[] fib(int n,int index){
		if(index>=n){
			return array;
		}
		if(n==0){
			return array;
		}
		if( n==1){
			array[index]=0;
			return array;
		}
		if(n==2){
			array[index]=0;
			array[index+1]=1;
			return array;
		}
		if(index==0 ){
			array[index]=0;
			index++;
			fib(n, index);
		}else if(index==1){
			array[index]=1;
			index++;
			fib(n, index);
		}else{
			array[index]=array[index-1]+array[index-2];
			index++;
			fib(n, index);
		}
		return array;
		
	}
}
