import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int ans = fac(n) / (fac(k) * fac(n - k));
        
        System.out.print(ans);
        
    }
    public static int fac(int n){
        if(n == 0) return 1;
        return n * fac(n-1);
    }
    
}