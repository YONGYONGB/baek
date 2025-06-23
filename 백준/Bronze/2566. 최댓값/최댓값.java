import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String args[])throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] board = new int[9][9];
        int max = 0;
        int mrow = 0;
        int mcol = 0;
        
        for(int i=0; i<9; i++){
            String[] line = br.readLine().split(" ");
            for(int j=0; j<9;j++){
                board[i][j] = Integer.parseInt(line[j]);
                if(board[i][j]>max){
                    max = board[i][j];
                    mrow = i;
                    mcol = j;
                }
            }
        }
        System.out.printf("%d\n%d %d", max, mrow+1, mcol+1);
    }
}