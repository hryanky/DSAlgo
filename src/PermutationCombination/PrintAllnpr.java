package PermutationCombination;

import java.util.ArrayList;
import java.util.List;

public class PrintAllnpr {

//	public static void main(String[] args) {
//		int n[]={1,2,3}, r=2, temp[]=new int[r];		
//		//npr(n,r,temp,0);
//		//solve(r,n);
//		print( r, n, 0, temp );
//	}
//	
//	 
//	    // need to know how many items are selected - r, input array - n
//	    // item which can be selected next - from and already selected items
//	    private static void print( final int r, final int[] n, final int start, final int[] temp ) {
//	        if (r == 0 ) { // all selected, just print them
//	            for ( int i = 0; i < temp.length; ++i ) {
//	                System.out.print( n[ temp[ i ] ] + " " );
//	            }
//	            System.out.println();
//	            return;
//	        }
//	        // select one and use recursion for others
//	        for ( int i = start; i < n.length; ++i ) {
//	        	temp[ temp.length - r ] = i;
//	            print( r - 1, n, start + 1, temp );
//	        }
//	    }
//
//	static void npr(int[] n , int r, int temp[], int start){
//		if(r==0){
//			for(int i=0;i<temp.length;++i){
//				System.out.print(n[temp[i]]);
//			}
//			System.out.println();
//			return;
//		}
//		for(int j=start;j<n.length;++j){
//			temp[temp.length-r]=j;
//			npr(n, r-1, temp,start+1);
//		}
////		for(int j=start;j<n.length && start<r;j++){
////			temp[start]=n[j];
////			npr(n, r, temp,start+1);
////		}
//	}
//}

	//public class PrintCombinations {

	    public static void main( final String[] args ) {
	        // testing input 1
	        int n = 2;
	        char[] a = { 'a', 'b', 'v', 'f' };
	        solve( n, a );

	        // testing input 2
	        n = 2;
	        a = new char[] { '1', '2', '3' };
	        solve( n, a );

	    }

	    private static void solve( final int n, final char[] a ) {
	        final int[] selected = new int[n];
	        print( n, a, 0, selected );
	    }

	    // need to know how many items are selected - n, input array - a
	    // item which can be selected next - from and already selected items
	    private static void print( final int n, final char[] a, final int from, final int[] selected ) {
	        if ( n == 0 ) { // all selected, just print them
	            for ( int i = 0; i < selected.length; ++i ) {
	                System.out.print( a[ selected[ i ] ] + " " );
	            }
	            System.out.println();
	            return;
	        }
	        // select one and use recursion for others
	        for ( int i = from; i < a.length; ++i ) {
	            selected[ selected.length - n ] = i;
	            print( n - 1, a, i + 1, selected );
	        }
	    }
	}