import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int row = Integer.parseInt(br.readLine());
        int[][] answer = new int[row][4];
        
        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;
        
        for(int i=0; i<row; i++){
            int number = Integer.parseInt(br.readLine());
            answer[i][0] = number/Quarter;
            number = number - answer[i][0]*Quarter;
            answer[i][1] = number/Dime;
            number = number - answer[i][1]*Dime;
            answer[i][2] = number/Nickel;
            number = number - answer[i][2]*Nickel;
            answer[i][3] = number/Penny;
        }
        
        for(int i=0; i<row; i++){
            System.out.printf("%d %d %d %d\n", answer[i][0], answer[i][1], answer[i][2], answer[i][3]);
        }
    }
}
