import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        int stand = Integer.parseInt(br.readLine());
        int s = 2 * stand - 1;
        
        for (int i = 0; i < s; i++) {
            StringBuilder sb = new StringBuilder();

            if (i < stand) {
                sb.append(" ".repeat(stand - i - 1));
                sb.append("*".repeat(2 * i + 1));
            } else {
                int down = i - stand + 1;
                sb.append(" ".repeat(down));
                sb.append("*".repeat(2 * (s - i - 1) + 1));
            }

            System.out.println(sb);
        }
    }
}
