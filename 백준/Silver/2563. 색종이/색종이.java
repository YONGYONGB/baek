import java.util.*;
import java.io.*;

public class Main{
    
    
    public static void main(String[] args) throws IOException{
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        boolean[][] point = new boolean[100][100];
        
        // 값 넣기
        for(int i=0; i<num; i++){
            String[] box = br.readLine().split(" ");
            int row = Integer.parseInt(box[0]);
            int col = Integer.parseInt(box[1]);
            
      
            for(int j=row; j<row+10; j++){
                for(int r=col; r<col+10; r++){
                    point[j][r] = true;
                }
            }
        }
        
        int count =0;
        
        for(int j=0; j<100; j++){
           for(int r=0; r<100; r++){
               if(point[j][r] == true){
                   count++;
               }
           }
        }
        
        System.out.print(count);
        
        
    }
    
    
}