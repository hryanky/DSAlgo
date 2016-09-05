/*Given a number n, print following pattern without using any loop.

Input: n = 16
Output: 16, 11, 6, 1, -4, 1, 6, 11, 16

Input: n = 10
Output: 10, 5, 0, 5, 10*/

package Recursion;

public class Pattern {

	public static void main(String[] args) {
		int num =17;
		print(num);
	}

	static void print(int newnum){
		
		System.out.println(newnum);
		
		if (newnum>0) {
			newnum -= 5;
			print(newnum);
			System.out.println(newnum+=5);
		}

		
	}
}
