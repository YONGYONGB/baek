import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }else{
                sb.append(count(n)).append("\n");
            }
            
        }
        
        System.out.print(sb);
     
        
        
    }
    public static int count(int n){
        int num = 0;
        for(int i=n+1; i<=n*2; i++){
            boolean up = true;
            if (i < 2) continue;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    up = false;
                    break;
                }
            }
            if(up == true){
                num ++;
            }
        }    
        return num;
    }
}
