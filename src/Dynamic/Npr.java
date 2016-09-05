package Dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Npr {
	static Character[] array = {'a','b','c','d'};
	static char[] permArray = new char[4];
	static int i=0;

	public static void main(String[] args) {
		List<Character> remainingElemets = (List) Arrays.asList(array);
		
		npr(0,remainingElemets);

	}

	
	//permutes all of remainingElemets in perm Array 
	//from index start till he end of permArray
	static void npr(int start,List<Character> remainingElemets){
      
		
		if (start < permArray.length) {
			for (Character c : remainingElemets) {
				permArray[start] = c;
				List<Character> exceptCurrentChracter = new ArrayList<>();
				exceptCurrentChracter.addAll(remainingElemets);
				exceptCurrentChracter.remove(c);
				npr(start + 1, exceptCurrentChracter);
			} 
		}
		else{
			i++;
			
		System.out.print("Perm Number is "+i+": ");
		System.out.println(permArray);

		}
	}

}
