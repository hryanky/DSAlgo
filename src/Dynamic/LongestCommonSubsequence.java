/*LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
*/
package Dynamic;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String str1 = "ACDBICD"; 
		String str2 = "CDABCDACDBICDACDBICD";
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		List<Integer> prevlist = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		int index=-1;
		for (int k = 0; k < array1.length; k++) {
			list = new ArrayList<>();
			index=-1;
			for (int i = k; i < array1.length; i++) {
				for (int j = index+1; j < array2.length; j++) {
					if (array1[i] == array2[j]) {
						list.add(j);
						index = j;
						break;
					}
				}
			}
			if (list.size() > prevlist.size()) {
				prevlist=null;
				prevlist = list;
			} 
		}
		System.out.println(prevlist.size());
	}

}
