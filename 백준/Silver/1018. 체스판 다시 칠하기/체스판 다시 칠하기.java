import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] num = br.readLine().split(" ");
        
        int row = Integer.parseInt(num[0]);
        int col = Integer.parseInt(num[1]);
        
        boolean[][] fan = new boolean[row][col];
        
        for(int i=0; i<row; i++){
            String color = br.readLine();
            for(int j=0; j<col; j++){
                char c = color.charAt(j);
                int k = i+j; 
                if((k%2==0) && c == 'W'){
                    fan[i][j] = true;
                }else if((k%2==1) && c == 'B'){
                    fan[i][j] = true;
                }
            }
        }
        
        int reverse = 64;
        
        int min = 64;
        
        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= col - 8; j++) {
                int count = 0; 

                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if(fan[x][y] == false) count++;
                    }
                }
                min = Math.min(min, Math.min(count, reverse - count)); 
            }
        }
        
        System.out.print(min);
    }
}
