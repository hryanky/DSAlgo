package String;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringWithoutSpecialCharacters {

	class Inner{
		void test() {
		}
	}
	public static void main(String[] args) {
		String str="Ab,c,de!$";
		int weightArray[] = new int[2];
		for (int i = 0; i < 2; i++) {
			//String s[] = (String) "{}()";
			Scanner scan = new Scanner(System.in);
			 weightArray[i] = scan.nextInt();
			
		}
		//		try{
//			//int a = 4/0;
//			
//		}catch (Exception e){
//			System.out.println(".");
//		}finally {
//			System.out.println("..");
//		}
		char[] finalStr = str.toCharArray();
		int i=0,j=str.length()-1;
		String specialChars=",$#@!%^&*()_+~";
			
		while (i<j) {
			while (specialChars.indexOf(finalStr[i])!=-1) {
				i++;
				//finalStr[i]=str.charAt(i);
			}
			//front = str.charAt(i);
			while (specialChars.indexOf(finalStr[j])!=-1) {
				j--;
				//finalStr[j]=str.charAt(j);
			}
			char temp=finalStr[i];
			finalStr[i]=finalStr[j];
			finalStr[j]=temp;
			//char temp=str.charAt(i);
			//str.charAt(i)=str.charAt(j);
//			end = str.charAt(j);
//			char temp = front;
//			front = end;
//			end = temp;
			//char temp=str[i];
			
			i++;j--;
		}
			
		System.out.println(finalStr);
		
	}

}
