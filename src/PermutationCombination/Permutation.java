package PermutationCombination;

public class Permutation {

	public static void main(String[] args) {
		String str = "abc";
		  //  permutation("", str);
		permutation("", str); 
	}


	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
//	private static void permutation(int r, String str) {
//	    int n = str.length();
//	    if (n == 0) System.out.println(r);
//	    else {
//	        for (int i = 0; i < n; i++)
//	        	
//	            permutation(r-1, str.substring(0, i) + str.substring(i+1, n));
//	    }
//	}
}
