# Tic Tac Toe

This is a simple **Tic Tac Toe** game implemented in Java that runs in the terminal. Two players (X and O) take turns to place their marks on a 3x3 grid, and the game checks for win conditions after each move. The game also validates moves and announces the winner once the conditions are met.

## How to Play

1. The game starts with an empty 3x3 board.
2. Player X goes first, followed by Player O.
3. Players take turns inputting the row and column numbers (0, 1, or 2) where they want to place their mark.
4. The game checks for a winner after each move. The player who manages to align their marks (X or O) in a row, column, or diagonal wins.
5. The game ends when a player wins or when all the cells on the board are filled (which results in a draw if there's no winner).

## Features

- **Two-Player Game**: Alternates between Player X and Player O.
- **Win Detection**: The game detects wins by checking rows, columns, and diagonals.
- **Input Validation**: Ensures that players can only place their marks on empty cells and within the grid limits.
- **Draw Condition**: The game continues until either a player wins or the board is full (resulting in a draw).
  
## Requirements

- Java 8 or later

## How to Run

1. Compile the Java file:
   ```bash
   javac TicTacToe.java
   ```

2. Run the compiled Java file:
   ```bash
   java TicTacToe
   ```

3. Follow the on-screen instructions to play the game.

## Example

```bash
Player X enter row and column: 0 0

X |   |  
---------
  |   |  
---------
  |   |  

Player O enter row and column: 1 1

X |   |  
---------
  | O |  
---------
  |   |  
```

## Game End Scenarios

1. **Winning**: The game announces when a player wins by aligning their marks in a row, column, or diagonal.
   
   Example:
   ```
   Player X has won!
   ```
   
2. **Draw**: The game declares a draw if all cells are filled and no player has won:
   ```
   It's a draw!
   ```

   Thankyou for your time.
