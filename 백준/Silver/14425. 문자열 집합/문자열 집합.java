import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] stand = br.readLine().split(" ");
        int n = Integer.parseInt(stand[0]);
        int m = Integer.parseInt(stand[1]);
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (set.contains(br.readLine())) {
                ans++;
            }
        }

        System.out.print(ans);
    }
}
