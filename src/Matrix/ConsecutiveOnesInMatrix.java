package Matrix;

public class ConsecutiveOnesInMatrix {

	public static void main(String[] args) {
		int [] [] matrix = {{0,1,1,0},{1,0,0,1},{1,1,1,1}};
		int num=0,m=3,n=4;
		for(int i=0;i<m;i++){
			
		}
		
		FizzBuzz(20);
	}

	static String FizzBuzz(int until) {
        String status="";
        int i=0;
        for( i=1;i<=until;i++){
            if(i%3 == 0 && i%5==0){
            	status="FizzBuzz";
            System.out.println("FizzBuzz");
            
        }else if(i%3 == 0){
        	status  ="Fizz";
            System.out.println("Fizz");
            
        }else if(i%5 == 0){
        	status ="Buzz";
            System.out.println("Buzz");
           
        }else{
        	status=String.valueOf(i);
        	System.out.println(i);
        }
        }
        
    return status;
    }

}
