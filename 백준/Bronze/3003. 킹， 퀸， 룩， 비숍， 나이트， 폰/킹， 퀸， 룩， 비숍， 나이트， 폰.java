import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        List<Integer> answer = new ArrayList<>();
        
        int[] standard ={1,1,2,2,2,8};
        String[] num = br.readLine().split(" ");
        for(int i=0; i<num.length; i++){
            int a = Integer.parseInt(num[i]);
            answer.add(standard[i]-a);
        }
        
        System.out.print(answer.toString().replaceAll("[\\[\\],]", ""));
        
        
        
        
    }
    
}