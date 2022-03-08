import java.util.Scanner;

public class Board{
    public Board(int col, int i,int j){
        for(int k = 0; k < col; k ++){
            for(i = 0; i < 3; i++){
                for(j = 0; j < col+1; j++){
                    System.out.print("|\t");
                }
                System.out.print("\n");
                
            }
            for(int l = 0; l < 5*col-col+1; l++){
                System.out.print("- ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int i = 0, j = 0;
        Scanner rows = new Scanner(System.in);
        int col = rows.nextInt();
        Board obj = new Board(col,0,0);
    }
}