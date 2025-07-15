import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            if(input.equals("push")){
                dq.offerLast(Integer.parseInt(st.nextToken()));
            }else if(input.equals("pop")){
                if(!dq.isEmpty()){
                    sb.append(dq.pollFirst()).append("\n");
                }else{
                    sb.append("-1").append("\n");
                }
            }else if(input.equals("size")){
                sb.append(dq.size()).append("\n");
            }else if(input.equals("empty")){
                if(!dq.isEmpty()){
                    sb.append("0").append("\n");
                }else{
                    sb.append("1").append("\n");
                }
            }else if(input.equals("front")){
                if(!dq.isEmpty()){
                    sb.append(dq.peekFirst()).append("\n");
                }else{
                    sb.append("-1").append("\n");
                }
            }else if(input.equals("back")){
                if(!dq.isEmpty()){
                    sb.append(dq.peekLast()).append("\n");
                }else{
                    sb.append("-1").append("\n");
                }
            }
        }
        System.out.print(sb);

        
    }
}