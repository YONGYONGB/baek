import java.util.*;
import java.io.*;

public class Main{
    
    
    public static void main(String[] args) throws IOException{
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        if(N == 1){
        }else{
            fac(N);
        }
        
    }
    public static void fac(int N){
        if (N == 1) return;
        for(int i=2; i<= Math.sqrt(N); i++){
            if(N%i ==0){
                int num = N/i;
                System.out.println(i);
                fac(num);
                return;
            }
        }
        System.out.print(N);
    }
}