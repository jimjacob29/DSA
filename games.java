import java.util.Scanner;
public class games {
        public static void main(String[] args) {
            boolean flag = false;
            // Initialize board
            int[][] board = new int[3][3];
            int turn = 9 ;
            for(int i = 0 ; i < 3 ; i++){
                for(int j = 0 ; j < 3 ; j++){
                    board[i][j] = ' ';
                }
            }
            while(turn-- > 0){
                // for player turn
                if(turn%2 == 0){
                    System.out.println("Player 1 turn");
                    playerTurn(board , 1);
                }
                else{
                    System.out.println("Player 2 turn");
                    playerTurn(board , -1);
                }

                // Print board for each turn
                printBoard(board);
                System.out.println();

                // Check for the winning strategy
                flag  = isWinner(board);
                if(flag){
                    break;
                }
            }
            if(!flag){
                System.out.println("Oops it's a tie");
            }
        }
        static boolean isWinner(int[][] board){
            int sum;
            // for horizontal check
            for(int i = 0 ; i < 3 ; i++){
                sum = 0;
                for(int j = 0 ; j < 3 ; j++){
                    sum += board[i][j];
                    if(sum == 3){
                        System.out.println("Player 1 is winner");
                        return true;
                    }
                    if(sum == -3){
                        System.out.println("Player 2 is winner");
                        return true;
                    }
                }
            }
            // for vertical check
            for(int i = 0 ; i < 3 ; i++){
                sum = 0;
                for(int j = 0 ; j < 3 ; j++){
                    sum += board[j][i];
                    if(sum == 3){
                        System.out.println("Player 1 is winner");
                        return true;
                    }
                    if(sum == -3){
                        System.out.println("Player 2 is winner");
                        return true;
                    }
                }
            }
            // for main diagonal check
            if(board[0][0]!=32 && board[1][1]!=32 && board[2][2]!=32){
                sum = board[0][0]+board[1][1]+board[2][2];
                if(sum == 3){
                    System.out.println("Player 1 is winner");
                    return true;
                }
                if(sum == -3){
                    System.out.println("Player 2 is winner");
                    return true;
                }
            }
            // for opposite diagonal check
            if(board[0][2]!=32 && board[1][1]!=32 && board[2][0]!=32){
                sum = board[0][2]+board[1][1]+board[2][0];
                if(sum == 3){
                    System.out.println("Player 1 is winner");
                    return true;
                }
                if(sum == -3){
                    System.out.println("Player 2 is winner");
                    return true;
                }
            }

            return false;
        }

        static void playerTurn(int[][] board , int player){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please provide your co-ordinates");
            int x = sc.nextInt();
            int y = sc.nextInt();
            // if invalid position is entered
            if(x < 0 ||x > 2 || y < 0 || y > 2){
                System.out.println("Invalid Position, game will exit");
                System.exit(0);
            }
            // if position already occupied
            if(board[x][y] == 1 || board[x][y] == -1){
                System.out.println("Position already Occupied, please put correct co-ordinates");
                // repeat turn
                if(board[x][y] == 1)
                    playerTurn(board , -1);
                else
                    playerTurn(board , 1);
            }
            // puts 1 for player 1 and -1 for player 2
            // 1 is displayed on the board as X and O for -1
            else
                board[x][y] = player;

        }

        static void printBoard(int[][] board){
            // Print Board
            for(int i = 0 ; i < 3 ; i++){
                for(int j = 0 ; j < 3 ; j++){
                    if(board[i][j]==32){
                        System.out.print(" "+" | ");
                    }
                    else if(board[i][j]==1)
                        System.out.print("X"+" | ");
                    else
                        System.out.print("O"+" | ");
                }
                System.out.println();

                System.out.println("-----------");
            }
        }
    }

