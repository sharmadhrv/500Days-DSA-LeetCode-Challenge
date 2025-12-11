package arrays.tictactoe;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TicTacToe {

    private Map<Integer,Character> board;
    Scanner scanner = new Scanner(System.in);

    public TicTacToe(){
        board  = new HashMap<>();
    }
    public void oxGame()
    {
        boolean gameOver = false;
        char player1 = 'O';
        char player2 = 'X';

      char currentPlayer = gameStart();

       while(!gameOver) {
           System.out.println("Chance of player " + currentPlayer);
           System.out.print("enter number of position (1 to 9): ");
           int position = scanner.nextInt();
           if (isValid(position)) {
               board.put(position, currentPlayer);
           } else {
               System.out.println("invalid move");
               continue;
           }
           displayBoard();

           //win
           if(checkWin(currentPlayer)) {
               System.out.println(currentPlayer + " is the winner....");
               System.out.print("Wanna play again....(y/n)? ");
               String choice = scanner.next();
               if(choice.equals("n"))
                   gameOver = true;
               else
                   currentPlayer = gameStart();
               continue;
           }
           //isfull
           else if(isFull()) {
               System.out.println("OOps match Draw...");
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
        for(int i =1;i<=9;i++)
        {
            board.put(i,' ');
        }
    }

    private void  displayBoard()
    {
        for(int i =1;i<=9;i+=3)
        {
            System.out.println(" "+board.get(i)+" | "+board.get(i+1)+" | "+board.get(i+2));
            if(i<7)
                System.out.println("---+---+---");
        }
    }
    private boolean isValid(int position)
    {
        if(position<1 || position > 9 || board.get(position)!= ' ')
            return false;
        return true;
    }

    private boolean isFull()
    {
        for(int i =1;i<=9;i++)
        {
            if(board.get(i)==' ')
                return false;
        }
        return true;
    }

    private boolean checkWin(char currentPlayer)
    {
        //row check
        for(int i = 1;i<=9;i+=3)
            if(board.get(i) == currentPlayer && board.get(i+1) == currentPlayer && board.get(i+2) == currentPlayer)
                return true;

        //column check
        for(int i =1;i<=3;i++)
            if(board.get(i) == currentPlayer && board.get(i+3) == currentPlayer && board.get(i+6) == currentPlayer)
                return true;
        //Diagonal check
        if(board.get(1) == currentPlayer && board.get(5) == currentPlayer && board.get(9) == currentPlayer)
            return true;
        if(board.get(3) == currentPlayer && board.get(5) == currentPlayer && board.get(7) == currentPlayer)
            return true;

        return false;


    }


}
