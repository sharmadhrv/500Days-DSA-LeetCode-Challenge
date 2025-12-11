package arrays.tictactoe;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TicTacToe2 {

    char[][] board;
    Scanner scanner = new Scanner(System.in);

    public TicTacToe2(){
        board = new char[3][3];
    }
    public void oxGame(){

        boolean gameOver = false;
        char player1 = 'O';
        char player2 = 'X';

        char currentPlayer = gameStart();

        while(!gameOver) {
            System.out.println("Chance of player " + currentPlayer);
            System.out.print("enter number of row (1 to 3): ");
            int row = scanner.nextInt()-1;
            System.out.print("enter number of column (1 to 3): ");
            int col = scanner.nextInt()-1;
            if (isValid(row,col)) {
                board[row][col] = currentPlayer;
            } else {
                System.out.println("invalid move");
                continue;
            }
            displayBoard();
            if(checkWin(currentPlayer)) {
                System.out.println(currentPlayer + " is the winner....");
                System.out.print("Wanna play again....(y/n)? ");
                String choice = scanner.next();
                if (choice.equals("n"))
                    gameOver = true;
                else
                    currentPlayer = gameStart();
                continue;
            }
                //isfull
               else if(isFull()) {
                System.out.println("Oops match Draw...");
                System.out.print("Wanna play again....(y/n)? ");
                String choice = scanner.next();
                if(choice.equals("n"))
                    gameOver = true;
                else
                    currentPlayer = gameStart();
                continue;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

    }

    private char  gameStart()
    {
        initializeBoard();
        displayBoard();
        char currentPlayer;
        int toss = RandomGenerator.getDefault().nextInt(1, 3);
        if(toss == 1)
            currentPlayer = 'O';
        else
            currentPlayer = 'X';
        return currentPlayer;
    }

    private void initializeBoard()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                board[i][j] = ' ';
            }
        }
    }

    private void displayBoard(){
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+board[i][j]);
                if(j!=2)
                    System.out.print(" | ");
            }
            if(i!=2)
                System.out.println("\n---+----+---");
        }
        System.out.println();
    }

    private boolean isFull(){
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j] == ' ')
                    return false;
            }

        }
        return true;
    }

    private boolean isValid(int row,int col){
        if(row<0 || row >=3 || col <0 || col >=3 || board[row][col] != ' ')
            return false;
        return true;
    }

    private  boolean checkWin(char currentPlayer)
    {
        for(int i = 0;i<3;i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer ||
                    board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
                return true;
        }
            if(board[0][0] == currentPlayer &&  board[1][1] == currentPlayer && board[2][2]==currentPlayer)
                return true;

            if(board[0][2] == currentPlayer &&  board[1][1] == currentPlayer && board[2][0]==currentPlayer)
                return true;
            return  false;

    }
}

