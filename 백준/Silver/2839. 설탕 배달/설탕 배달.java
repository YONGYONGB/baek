import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int a = n/5; 
        int min = 10000;
        
        for(int i=0;i<=a;i++){
            int count = n - (i*5);          
            if(count %3 ==0){
                min = Math.min(min,i+ count/3);
            }
        }
        
        if(min == 10000){
            min = -1;
        }
        
        System.out.print(min);
        
        
    }
    
}