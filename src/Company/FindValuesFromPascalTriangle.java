/*Given c, r return value at column, row r.

     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
 
getPascalValue(0,0) = 1
getPascalValue(1,1) = 1
getPascalValue(1,3) = 3
getPascalValue(2,4) = 6
 

public int getPascalValue(int c, int r)  {
    if((c==0 && r == 0) || (c==0)){
        return 1;
    }
    if(r<c){
        System.out.println("Invalid ENtry");
        return -1;
    }else 
    return getPascalValue(int c , int r-1) + getPascalValue(int c-1 ,int r-1);
}9po
*/
package Company;

public class FindValuesFromPascalTriangle {
static int[][] pascal = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
	public static void main(String[] args) {
		System.out.println(getvalues(4,3));
	}

	static int getvalues(int col, int row){
		if(col<0 || row<0 || row<col){
			System.out.println("Invalid data");		
			return -1;
		}
		if(col==0 || row<2 || col==row){
			return 1;
		}
		return getvalues(col, row-1)+getvalues(col-1, row-1);
		
	}
}
