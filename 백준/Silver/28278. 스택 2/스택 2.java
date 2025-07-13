import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(stz.nextToken());

            if (cmd == 1) {
                st.push(Integer.parseInt(stz.nextToken()));
            } else if (cmd == 2) {
                sb.append(st.isEmpty() ? -1 : st.pop()).append('\n');
            } else if (cmd == 3) {
                sb.append(st.size()).append('\n');
            } else if (cmd == 4) {
                sb.append(st.isEmpty() ? 1 : 0).append('\n');
            } else if (cmd == 5) {
                sb.append(st.isEmpty() ? -1 : st.peek()).append('\n');
            }
        }
        System.out.print(sb);
        
        
    }
    
}