/* Gray blocks are dead ends (value = 0). 


Following is binary matrix representation of the above maze.

                {1, 0, 0, 0}
                {1, 1, 0, 1}
                {0, 1, 0, 0}
                {1, 1, 1, 1}
Following is maze with highlighted solution path.



Following is the solution matrix (output of program) for the above input matrx.

                {1, 0, 0, 0}
                {1, 1, 0, 0}
                {0, 1, 0, 0}
                {0, 1, 1, 1}
 All enteries in solution path are marked as 1.*/

package Matrix;

public class MazeRace {
	static int[][] matrix =  {  {1, 0, 0, 0},
							    {1, 1, 0, 1},
							    {1, 1, 0, 0},
							    {1, 1, 1, 1}
							 };
	static int[][] newMatrix=new int[matrix.length][matrix.length];
	public static void main(String[] args) {
		newMatrix[0][0]=1;
		findPath(0,0);
	}
	
	static void findPath(int row,int col){

		if (row == matrix.length - 1 && col == matrix.length - 1) {
			print();
		}

		if (col + 1 < matrix.length && matrix[row][col + 1] != 0) {
			newMatrix[row][col + 1] = 1;
			findPath(row, col + 1);
		}
		if (row + 1 < matrix.length && matrix[row + 1][col] != 0) {
			newMatrix[row+1][col] = 1;
			findPath(row+1, col);
		}
		
		newMatrix[row][col] = 0;

	}

	static void print(){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(newMatrix[i][j]);
			}
			System.out.println("");
		}
	   
		System.out.println("\n\n\n");
	}
}
