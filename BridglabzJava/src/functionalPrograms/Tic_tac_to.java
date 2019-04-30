package functionalPrograms;
import java.util.Scanner;

public class Tic_tac_to {
	static Scanner s=new Scanner(System.in);
	 public static  int row;
	 public static  int col;
	 public static char [][]board=new char[3][3];
	 public static char turn='X';
	
	public static void main(String[]args)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]='_';
			}
		}
		
		
		play();
	}

	private static void play() {
		// TODO Auto-generated method stub
		printBoard();
		
		boolean play=true;
		
		
		while(play)
		{System.out.println("enter the row and column");
			row=s.nextInt()-1;
			col=s.nextInt()-1;
			if(row<1 || row>3 || col<1 || col>3 )
			{
				System.out.println("RANGE IS INVALIDE");
			}
			board[row][col]=turn;
			printBoard();
			if(GAmeOver(row,col))
			{play=false;
				System.out.println("Game is over" + turn + "win");
			}
				
	
			if(turn=='X')
				turn='O';
				else
					turn='X';
				
		}
		
	}

	private static boolean GAmeOver(int row2, int col2) {
		// TODO Auto-generated method stub
		// for perpendicular
		if(board[row2][0]==board[row2][1] && board[row2][0]==board[row2][2])
		{return true;
		
		}
		if(board[0][col2]==board[1][col2]&& board[0][col2]==board[2][col2])
		{
			return true;
		}
		//diagonaly
		if(board[0][0]==board[1][1]&& board[0][0]== board[2][2] && board[1][1]!='_')
		{
			return true;
		}
		if(board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[1][1]!='_')
		{
			return true;
		}
		
		return false;
	}

	private static void printBoard() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			System.out.println();
			System.out.print("| ");
			for(int j=0;j<3;j++)
			{
				System.out.print(board[i][j]+ " | ");
			}
		}
		System.out.println();
	}

}
