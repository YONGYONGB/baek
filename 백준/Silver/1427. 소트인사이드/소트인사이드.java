import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int len = n.length();
        
        int[] ans = new int[len];
        
        for(int i=0; i<len; i++){
            ans[i] = (int)(n.charAt(i)-'0');
        }
        
        Arrays.sort(ans);
        
        for(int i=0; i<len; i++){
            System.out.print(ans[len-1-i]);
        }
        
    }
}
