
public class MaceRace {
	static int[][] matrix =  {  {1, 0, 0, 0},
		    {1, 1, 0, 1},
		    {1, 1, 0, 0},
		    {1, 1, 1, 1}
		 };
	public static void main(String[] args) {
		matrix[0][0]=1;
		check(0,0);
	}

	static void check(int row,int col){
		if(row==matrix.length-1 && col == matrix.length-1){
			print();
			//return;
		}
		
		if(col+1<matrix.length && matrix[row][col+1]!=0){
			matrix[row][col+1]=1;
			check(row, col+1);
		}
		if(row+1<matrix.length && matrix[row+1][col]!=0){
			matrix[row+1][col]=1;
			check(row+1, col);
		}
		matrix[row][col]=0;
	}
	
	static void print(){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
