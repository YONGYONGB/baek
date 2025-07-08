import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[][] ans = new String[n][2];
        
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");  
            ans[i][0] = input[0];
            ans[i][1] = input[1];
        }
        
        Arrays.sort(ans, (a,b)->{
            if(a[0].equals(b[0])){
                return 0;
            }
            return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
        });
        
        StringBuilder sb = new StringBuilder();
        for (String[] a : ans) {
            sb.append(a[0]).append(" ").append(a[1]).append('\n');
        }

        System.out.print(sb);
        
        
    }
    
    
}