import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long num = Integer.parseInt(br.readLine());
        
        System.out.println(num * 4);
    }
}