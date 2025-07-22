import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> num = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int number = Integer.parseInt(st.nextToken());
            num.add(number);
        }
        
        Collections.sort(num);
        int ans = num.get(0) * num.get(n - 1);
        
        System.out.print(ans);
        
        
        
    }
    
}