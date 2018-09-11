package Assignment1;
import java.util.*;
public class TicTacToe {
public static void board(char[][]board)
{
	for(int i=0;i<board.length;i++)
	{
		for(int j=0;j<board.length;j++)
		{
			System.out.print(board[i][j]+"|");
		}
		System.out.println( );
	}
}
public static boolean isGameOver(char a[][])
{
	if(a[0][0]==a[0][1]&&a[0][1]==a[0][2]&&a[0][0]!='-')
		return true;
	if(a[1][0]==a[1][1]&&a[1][1]==a[1][2]&&a[1][0]!='-')
		return true;
	if(a[2][0]==a[2][1]&&a[2][1]==a[2][2]&&a[2][0]!='-')
		return true;
	if(a[0][0]==a[1][0]&&a[1][0]==a[2][0]&&a[0][0]!='-')
		return true;
	if(a[0][1]==a[1][1]&&a[1][1]==a[2][1]&&a[0][1]!='-')
		return true;
	if(a[0][2]==a[1][2]&&a[1][2]==a[2][2]&&a[1][2]!='-')
		return true;
	if(a[0][0]==a[1][1]&&a[1][1]==a[2][2]&&a[0][0]!='-')
		return true;
	if(a[0][2]==a[1][1]&&a[1][1]==a[2][0]&&a[0][2]!='-')
		return true;
	
	return false;
}
	public static void main(String[] args) {
		char[][]board= {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
		Scanner obj=new Scanner(System.in);
		int x;
		int y;
		while(true)
		{
			board(board);
			System.out.println("enter player one positions");
			x=obj.nextInt();
			y=obj.nextInt();
			if(board[x][y]=='-')
			{
				board[x][y]='X';
				if(isGameOver(board))
				{
					System.out.println("player 1 won the game");
					break;
 				}
			}
			board(board);
			System.out.println("enter player two positions");
			x=obj.nextInt();
			y=obj.nextInt();
			if(board[x][y]=='-')
			{
				board[x][y]='O';
				if(isGameOver(board))
				{
					System.out.println("player 2 won the game");
					break;
 				}
			}
			}
	}
}
