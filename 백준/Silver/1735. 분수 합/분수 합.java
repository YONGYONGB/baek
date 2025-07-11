import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        
        int a1 = Integer.parseInt(input1[0]);
        int a2 = Integer.parseInt(input1[1]);
        int b1 = Integer.parseInt(input2[0]);
        int b2 = Integer.parseInt(input2[1]);
       
        int c = lcm(a2,b2);
        int d = a1*(c/a2)+ b1*(c/b2);
        
        int gcd = gcd(d, c);
        d /= gcd;
        c /= gcd;
            
        System.out.print(d+ " " + c);
        
    }
    
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }
    
}