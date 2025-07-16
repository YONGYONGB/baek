import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        int count = 1;
        for(int i=1; i<=n; i++){
            dq.offerLast(i);
        }
        
        sb.append("<");
        
        while(dq.size()>1){
            int temp = dq.pollFirst();
    
            if(count == k){
                sb.append(temp).append(",").append(" ");
                count =0;
            }else{
                dq.offerLast(temp);
            }
            count++;
        }
        
        sb.append(dq.poll()).append(">");
        
        System.out.print(sb);
        
    }
}