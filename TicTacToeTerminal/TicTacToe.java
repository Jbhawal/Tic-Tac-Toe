import java.util.Scanner;

class TicTacToe {
  public static void main(String[] args) {
    char[][] board = new char[3][3];
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = ' ';
      }
    }

    char player = 'X';
    boolean gameOver = false;
    Scanner sr = new Scanner(System.in);

    while (!gameOver) {
      printBoard(board);
      System.out.print("Player " + player + " enter row and column: ");
      int row = sr.nextInt();
      int col = sr.nextInt();
      System.out.println();

      if(row>2 || col>2){
        System.out.println("Out of limits. Place proper location.");
        continue;
      }
  
      if (board[row][col] == ' ') {
        board[row][col] = player; // put element
        gameOver = haveWon(board, player);

        if (gameOver) System.out.println("Player " + player + " has won!");
        else if (isBoardFull(board)) {
            System.out.println("It's a draw!");
            gameOver = true;
        }
        else player = (player == 'X') ? 'O' : 'X';
      }
      else System.out.println("Invalid move. Place proper location.");
    }
    printBoard(board);
  }

  public static boolean haveWon(char[][] board, char player) {
    // rows
    for (int row = 0; row < board.length; row++) {
      if (board[row][0] == player && board[row][1] == player && board[row][2] == player) return true;
    }

    // columns
    for (int col = 0; col < board[0].length; col++) {
      if (board[0][col] == player && board[1][col] == player && board[2][col] == player) return true;
    }

    // diagonals
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
    if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
    return false;
  }

  public static boolean isBoardFull(char[][] board) {
    for (int row = 0; row < board.length; row++) {
        for (int col = 0; col < board[row].length; col++) {
            if (board[row][col] == ' ') {
                return false;
            }
        }
    }
    return true;
}

  public static void printBoard(char[][] board) {
    for (int row = 0; row < board.length; row++) {
        for (int col = 0; col < board[row].length; col++) {
            System.out.print(board[row][col]);
            if (col < board[row].length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
        if (row < board.length - 1) {
            System.out.println("---------");
        }
    }
  }
}