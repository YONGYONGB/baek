import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int num = (int)Math.pow(2,N)+1;
        int answer = num*num;
        
        System.out.print(answer);
        
    }
}