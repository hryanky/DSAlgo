package Matrix;

public class TilingProblem {

	public static void main(String[] args) {
		int N = 2;
		int[][] matrix = new int[N][N];
		matrix[0][1]=2;
		divide(matrix,0,0);
	}

	static int[][] divide(int[][] matrix , int start,int end){
		if(matrix.length==2){
			for(int i=start;i<=end;i++){
				for (int j = i; j <= end; j++) {
					if(matrix[i][j]!=1 && matrix[i][j]!=2){
						matrix[i][j]=1;
					}
				}
			}
		}else{
			int[][] matrix0=new int[matrix.length/2][matrix.length/2];
			int[][] matrix1=new int[matrix.length/2][matrix.length/2];
			int[][] matrix2=new int[matrix.length/2][matrix.length/2];
			int[][] matrix3=new int[matrix.length/2][matrix.length/2];
			for(int i=start;i<=end;i++){
				for (int j = i; j <= end; j++) {
					if(matrix[i][j]!=1 && matrix[i][j]!=2){
						matrix[i][j]=1;
					}
				}
			}
		}
		
		return matrix;		
	}
}
