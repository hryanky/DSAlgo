import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
class test1 extends test{
	
}
public class test {

	public static void main(String[] args) {
		
		int[] array=new int[2];
        int i=0;
       //Scanner in = new Scanner(System.in); 
//	    while (in.hasNext()) {
//	        if (in.hasNextInt()){
//               array[i]= in.nextInt();
//            }
//	        else {
//	            array[i]= in.nextInt();
//            }
//            //
//            
//            i++;
//            
//	    }
        //System.out.println(array[0],array[1]);
		
		
		String[] values ={"{}[]())", 
				"{[}]}"};
		
		String v[]=braces(values) ;
		System.out.println(v[1]);
//		String array[]=new String[2]; 
//		array[0]="";
//		for(int i=0;i<4;i++){
//			if(i==3){
//				continue;
//			}
//		}
		//System.out.println(12321/10);
		//int number = 12321;
//		test t = new test();
		int a = 5;
//		System.out.println("First : " + a);
		method(a);
//		System.out.println("second : " + a);
		Scanner in = new Scanner(System.in); 
	    while (in.hasNext()) {
	        if (in.hasNextInt())
	            System.out.println(in.nextInt());
	        else 
	            in.next();
	    }
	    method(3);
	}

	
	 static String[] braces(String[] values) {
		    Stack stack = new Stack(); 
		    String array[]=new String[values.length];    
		    for(int i=0;i<values.length;i++){  
		    String str=values[i];    
		    String status = "";
				if(str.isEmpty()){
		            array[i]="YES";
					continue;
				}
				if(str.length()%2 != 0 || (str.charAt(0)== ')')){
		            array[i]="NO";
					continue;
				}else {
					for(int j=0;j<(str.length());j++){
						if(str.charAt(j)=='('){
							stack.push(str.charAt(j));
						}else if(str.charAt(j)==')' && stack.size()>0){
							stack.pop();
						}else{
							array[i]="NO";
		                    continue;
						}
					}
					if(stack.isEmpty()){
						array[i]="YES";//status="YES";
					}
		            //System.out.print(status);
					//return status;
				}
		    }
		        return array;
		    }


	
	
	static void method(int b){
		String pattern="priy.a";
		System.out.println("First b : " + b);
		b=10;
		System.out.println("second b : " + b);
		StringTokenizer st = new StringTokenizer("00.55", ".");
		//System.out.println("....."+st);
		while(st.hasMoreElements()){
			String temp=(String) st.nextElement();
			if(temp.length()>3){
				//value=false;
			}
			if(!(Integer.parseInt(temp)>0 && Integer.parseInt(temp)<255 )){
				
			}
			System.out.println("StringTokenizer Output: " + temp);
//			if((Integer.parseInt((String) st.nextElement())>0 && Integer.parseInt((String) st.nextElement())<255 )){
//				
//			}
		}
		
	}
}

/*
 * scanner with space
 * 
 * 
 * 
 * */
 