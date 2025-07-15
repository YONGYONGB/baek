import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean getFood = true;
        String[] row = br.readLine().split(" ");
        
        int count = 1;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(row[i]);
            if(num != count){
                stack.push(num);
            }else{
                count++;
                while(true){
                    if(!stack.isEmpty() && stack.peek() == count){
                        stack.pop();
                        count++;
                    }else{
                        break;
                    }
                }
            }
        }
        
        if(stack.size() != 0 || count != n+1){
            getFood = false;
        }
        
        
       
        if(getFood == true){
            sb.append("Nice");
        }else{
            sb.append("Sad");
        }
        
        System.out.print(sb);
        
    }
}