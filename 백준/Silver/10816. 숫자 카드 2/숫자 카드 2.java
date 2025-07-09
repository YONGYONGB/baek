import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        
        String[] input = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(input[i]);
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        int m = Integer.parseInt(br.readLine());
        String[] input1 = br.readLine().split(" ");
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){        
            int num1 = Integer.parseInt(input1[i]);
            sb.append(map.getOrDefault(num1,0)).append(" ");
        }
        
        System.out.print(sb);
        
    }
}