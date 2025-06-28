import java.util.*;
import java.io.*;

public class Main{
    
    
    public static void main(String[] args) throws IOException{
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        int sum = 0;
        int min = 10000;
        
        for(int i= M;i <=N; i++){
            boolean pass = true;
            if(i == 1){
                pass = false;
            }
            for(int j=1; j<=Math.sqrt(i); j++){
                if(j>1 && i%j==0){
                    pass = false;
                    break;
                }
            }
            if(pass == true){
                sum += i;
                min = Math.min(min,i);
            }        
        }
        
        if(sum == 0){
            System.out.print(-1);
        }else{
            System.out.printf("%d", sum);
            System.out.println();
            System.out.printf("%d", min);
        }
    }
}