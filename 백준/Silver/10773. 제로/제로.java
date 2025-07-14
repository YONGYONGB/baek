import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n =Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0 ){
                ans -= stack.pop();
            }else{
                stack.push(num);
                ans += num;
            }
        }
        
        
        sb.append(ans);
        System.out.print(sb);
        
    }
    
}