import java.util.*;
import java.io.*;

public class Main{
    
    
    public static void main(String[] args) throws IOException{
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] info = br.readLine().split(" ");
        
        int[] num = new int['Z'-'A'+1];
        int count = 10;
        for(int i=0; i<26 ; i++){
            num[i] = count;
            count++;
        }
        
        String N = info[0];
        int B = Integer.parseInt(info[1]);
        int answer = 0;
        
        for(int i =0; i<N.length(); i++){
            char c = N.charAt(i);
            if(!Character.isDigit(c)){
                answer += num[c-'A'] * (int)Math.pow(B,N.length()-1-i);
            }else{
                answer += (int)(c-'0') * (int)Math.pow(B,N.length()-1-i);
            }
        }
        
        System.out.print(answer);
        
    }
}