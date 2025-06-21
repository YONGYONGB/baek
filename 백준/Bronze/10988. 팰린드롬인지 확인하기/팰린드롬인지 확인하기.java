import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String text = br.readLine();
        int len = text.length();
        boolean fen = true;
        
        for(int i=0; i< len/2; i++){
            if(text.charAt(i) == text.charAt(len-1-i)){
                continue;
            }else{
                fen = false;
                break;
            }
        }
        if(fen == true){
            System.out.print(1);
        }else{
             System.out.print(0);
        }
        
    }
    
}