import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            int num = Integer.parseInt(input[0]);
            int in = 0;
            if (input.length > 1) {
                in = Integer.parseInt(input[1]);
            }
            input(st, num, in);
        }
        
        
    }
    
    public static Stack<Integer> input(Stack<Integer> st, int num, int in){
        
        if(num == 1){
            st.push(in);
        }else if(num ==2){
            if(!st.isEmpty()){
                int temp = st.pop();
                System.out.println(temp);
            }else if(st.isEmpty()){
                System.out.println(-1);
            }
        }else if(num ==3){
            System.out.println(st.size());
        }else if(num ==4){
            if(!st.isEmpty()){
                System.out.println(0);
            }else if(st.isEmpty()){
                System.out.println(1);
            }
        }else if(num ==5){
            if(!st.isEmpty()){
                System.out.println(st.peek());
            }else if(st.isEmpty()){
                System.out.println(-1);
            }
        }
        
        return st;
    }
    
}