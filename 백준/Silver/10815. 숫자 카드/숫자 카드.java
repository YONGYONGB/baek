import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] temp = new int[n];
        
        String[] str1 = br.readLine().split(" ");
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            temp[i] = Integer.parseInt(str1[i]);
            map.put(temp[i],1);
        }
        
        int m = Integer.parseInt(br.readLine());
        String[] str2 = br.readLine().split(" ");
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m;i++){
            if(map.containsKey(Integer.parseInt(str2[i]))){
                sb.append(1).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }
        
        System.out.print(sb);
        
    }
    
}