import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean end = false;
    
        while(!end){
            Stack<Character> stack = new Stack<>();
            
            boolean balance = true;
            String str = br.readLine();
            
            if(str.charAt(0) == '.'){
                end = true;
                break;
            }else{
                 for(int i=0; i<str.length(); i++){
                    if(str.charAt(i) == '(' || str.charAt(i) == '['){
                        stack.add(str.charAt(i));
                    }else if(str.charAt(i) == ')'){
                        if(stack.isEmpty() || stack.pop() != '('){
                            balance = false;
                            break;
                        }    
                    }else if(str.charAt(i) == ']'){
                        if(stack.isEmpty() || stack.pop() != '['){
                            balance = false;
                            break;
                        } 
                    }                             
                }
                
                if(!stack.isEmpty()) balance = false;

                if(balance){
                    sb.append("yes").append("\n");
                }else{
                    sb.append("no").append("\n");
                }
                 
            }
           
            
        }
        
        System.out.print(sb);
        
    }
    
}