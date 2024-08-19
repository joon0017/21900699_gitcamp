import java.util.*;

public class Main {

    static int [][] board = new int[9][9];
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("문제를 입력하세요: ");
        try{
            for (int i = 0; i < 9; i++) {
                String[] line = scan.nextLine().split(" ");
                for (int j = 0; j < 9; j++) {
                    board[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        catch(Exception e){
            System.out.println("잘못된 입력입니다.");
            return;
        }

        // solve();

        System.out.println("\n\n\n");

        for(int i = 0;i < 9; i++){
            for(int j = 0;j < 9; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    void solver(){

    }

    void solveHorizontal(int rowNumber){
        for (int i = 0; i < 9; i++) {
            
        }
    }

}


/**

문제를 입력하세요: 
5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 9

 */