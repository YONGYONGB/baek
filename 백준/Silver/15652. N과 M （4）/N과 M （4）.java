import java.io.*;
import java.util.*;

public class Main{
    
    static int n;
    static int m;
    static int[] ans;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ans = new int[m];
        
        dfs(0,1);
        System.out.print(sb.toString());
    }
    
    public static void dfs(int depth,int start){
        if(depth == m){
            for(int i=0;i<m;i++){
                sb.append(ans[i]).append(" ");
            }
            return;
        }
        for(int i=start; i<=n; i++){
            ans[depth] = i;
            dfs(depth+1,i);
        }
    }
}