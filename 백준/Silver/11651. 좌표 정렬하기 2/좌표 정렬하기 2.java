import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             
        int n = Integer.parseInt(br.readLine());
        
        int[][] ans = new int[n][2];
        
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            ans[i][0] = Integer.parseInt(input[0]);
            ans[i][1] = Integer.parseInt(input[1]);
        }
        
        Arrays.sort(ans, (a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            return a[1] - b[1];
        });
            
        StringBuilder sb = new StringBuilder();
        for (int[] a : ans) {
            sb.append(a[0]).append(" ").append(a[1]).append('\n');
        }

        System.out.print(sb);
    }
    
}