package Dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ncr {
	static Character[] givenElements = { 'a', 'b', 'c' };
	static int n = 3;
	static int r = 2;
	static char[] combArray = new char[r];
	static int i = 0;
	static List<Character> commonList = new ArrayList<>();

	public static void main(String[] args) {
		ncr(0, (List) Arrays.asList(givenElements));
	}

	//generate all combinations of allElements in combArray from start index till length of combArray
	static void ncr(int start, List<Character> allElements) {

		if (combArray.length > start) {

			// make your own copy
			List<Character> remainingElements = new ArrayList<>();
			remainingElements.addAll(allElements);
			
			//Piyu will this work if you do not make your own copy?? give reason!!! then run and check!
			//List<Character> remainingElements = allElements;


			while (remainingElements.size() > 0) {
				char c = remainingElements.get(0);
				combArray[start] = c;
				// remove element since it can only be selected once...else will
				// re-selected in recursion!!!
				remainingElements.remove(0);
				
				//n_C_r = choose one char c ....then list all n-1_C_r-1
				ncr(start + 1, remainingElements);

				// by this time we printed all combinations having c in it...so we are done with 'c'
			}
		} else {
			System.out.println(combArray);
		}
	}
}

/*
 * if(start<combArray.length){ System.out.println(remainingElements.size()); for
 * (Character c : remainingElements) { combArray[start]=c;
 * 
 * List<Character> remainingElementsexceptCurrent = new ArrayList<>();
 * remainingElementsexceptCurrent.addAll(remainingElements);
 * remainingElementsexceptCurrent.remove(c); ncr(start + 1,
 * remainingElementsexceptCurrent); } }else{
 * 
 * System.out.println(combArray);
 * 
 * }
 */