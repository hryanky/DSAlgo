package Dynamic;

public class PrintAllNprOfaString {
	static String str="Pri";
	public static void main(String[] args) {
		npr("",0,str.length(),str.length());

	}
	static void npr(String temp,int start,int end,int length){
		if(length==0){
			print(temp);
			System.out.println();
		}
		for(int i=start;i<end;i++){
			temp+=str.substring(i,i+1);
			npr(temp,start+1,end, length-1);
		}
	}
	static void print(String temp){
		System.out.print(temp);
	}
}
