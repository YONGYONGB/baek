import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] ans = new int[n];
        
        String[] str = br.readLine().split(" ");
        
        for(int i=0;i<n;i++){
            ans[i] = Integer.parseInt(str[i]);
        }
        
        int[] temp = Arrays.copyOf(ans, ans.length);
        Arrays.sort(temp); 
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        
        for(int i=0;i<n;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],index);
                index++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int a: ans){
            sb.append(map.get(a)).append(" ");
        }
        
        System.out.print(sb);
        
    }
    
    
}