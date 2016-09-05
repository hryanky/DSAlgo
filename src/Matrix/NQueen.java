package Matrix;

public class NQueen {
	static int N=8,count=0;
	public static void main(String[] args) {
		
		int[][] matrix =new int [N][N];
		
		boolean sol = solveNQueen(matrix,0);
		if(count==0){
			System.out.println("No solution exists!");
		}

		}

	static boolean solveNQueen(int[][] matrix,int col){
		int i;
		if(col>=N){
			for (int m = 0; m < N; m++) {
				for (int j = 0; j < N; j++) {
					System.out.print(matrix[m][j] + " ");
				}
				System.out.println();
				count++;
			}
			System.out.println();
			//return true;
		}
		for( i=0;i<N;i++){ //row
			if(placeElementSafe(matrix,i, col)){
				matrix[i][col]=1;
				if(solveNQueen(matrix, col+1)){
					
					return true;
					
				}
				matrix[i][col]=0;
			}
			
		}
		
		return false;
	}
	
	static boolean placeElementSafe(int[][] matrix,int row,int col){

		for(int i=0;i<col;i++){
			if(matrix[row][i]==1){
				return false;
			}
		}
		 for (int i=row, j=col; i>=0 && j>=0; i--, j--)
	            if (matrix[i][j] == 1)
	                return false;
	 
	        /* Check lower diagonal on left side */
	        for (int i=row, j=col; j>=0 && i<N; i++, j--)
	            if (matrix[i][j] == 1)
	                return false;
	 
		return true;
	}
}
