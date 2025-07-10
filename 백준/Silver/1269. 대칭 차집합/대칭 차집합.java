import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
      
        HashSet<Integer> set = new HashSet<>();
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int input = Integer.parseInt(st1.nextToken());
            set.add(input);
        }
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int input = Integer.parseInt(st2.nextToken());
            if(set.contains(input)){
               set.remove(input);
            }else{
                set.add(input);
            }
        }
        
      System.out.print(set.size());
        
        
    }
}