import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            String input = br.readLine();
            int a = 0;
            int b = 0;
            boolean isVPS = true;
            for(int j=0; j<input.length(); j++){
                if(input.charAt(j) == '('){
                    a++;
                }else if(input.charAt(j) == ')'){
                    b++;
                }
                
                if(b>a || ( j ==input.length()-1 && a !=b) ){
                    isVPS = false;
                    break;
                }
            }
            if(isVPS == true){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);
    }
    
}