import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] ans = new int[n];
        
        for(int i=0; i<n; i++){
            ans[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(ans);
        
        for (int i = 0; i < n; i++) {
            bw.write(ans[i] + "\n");
        }

        bw.flush();
        bw.close();
        
    }
}