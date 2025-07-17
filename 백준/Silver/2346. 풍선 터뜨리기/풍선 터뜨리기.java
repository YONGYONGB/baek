import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();        
        
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        
        int cur =0;
        int count = 0;
        
        while(count<n){
            sb.append(cur+1).append(" ");
            int move = list[cur];
            list[cur] = 0;
            count++;
            
            if (count == n) break;
            
            int go = 0;
            if(move >0){
                while(go < move){
                    cur = (cur +1) % n;
                    if(list[cur] != 0) go++;
                }
            }else{
                while(go < -move){
                    cur = (cur - 1+n) % n;
                    if(list[cur] != 0) go++;
                }
            }
            
        }
        
        System.out.print(sb);
        
        
        
    }
}