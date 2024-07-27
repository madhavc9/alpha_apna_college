// N QUEENS 

package lecture;

public class L_22_4 {

	// nqueens function 
	public static void nQueens(char board[][],int row) 
	{
		// base condition
		if(row== board.length) 
		{
			count++;
			printBoard(board);
			return;
		}
		// column loop
		for (int j=0;j<board.length;j++)  
		{
			if(isSafe(board,row,j)) 
			{
				 board[row][j]='Q';
				 nQueens(board,row+1);//function call
				 board[row][j]='x';//backtracking step
				  
			}
		}
	}
	
	// nqueens function print one solution 
	public static boolean nQueens2(char board[][],int row) 
	{
		// base condition
		if(row== board.length) 
		{
			return true ;
		}
		// column loop
		for (int j=0;j<board.length;j++)  
		{
			if(isSafe(board,row,j)) 
			{ 
				 board[row][j]='Q';
				 if(nQueens2(board,row+1)) {//function call
				 return true;
				 }
				 board[row][j]='x';//backtracking step
			}
		}
		return false;
	}
	
	// is safe function 
	public static boolean isSafe(char board[][],int row,int col) {
		// vertical up
		 for(int i=row-1;i>=0;i--) {
			 if(board[i][col]=='Q') {
				 return false;
			 }
		 }
		// diag left up
		for (int i=row-1,j=col-1;i>=0&& j>=0;i--,j--) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
		// diag right up
		for(int i=row-1,j=col+1;i>=0&& j<board.length;i--,j++) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
		return true;
	}
	
	// print board function 
	public static void printBoard(char board[][]) {
		System.out.println("------CHESS BOARD------");
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int count =0;
	public static void main(String[] args) {
		int n=4;
		char board[][]=new char[n][n];
		// initialise
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='x';
			}
		}
//		nQueens(board,0);
//		System.out.println();
//		System.out.println("total number of ways :" + count);
		
		if(nQueens2(board,0)==true) {
			System.out.println("Solution is Possible");
			printBoard(board);
		} else {
			System.out.println("Solution not possible");
		}
	}
}
