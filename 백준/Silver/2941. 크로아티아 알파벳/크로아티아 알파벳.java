import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String word = br.readLine();
        int answer = 0;

        for (int i = 0; i < word.length(); ) {
            if (i <= word.length() - 3) {
                String w3 = word.substring(i, i + 3);
                if (Arrays.asList(st).contains(w3)) {
                    i += 3;
                    answer++;
                    continue;
                }
            }
            if (i <= word.length() - 2) {
                String w2 = word.substring(i, i + 2);
                if (Arrays.asList(st).contains(w2)) {
                    i += 2;
                    answer++;
                    continue;
                }
            }
            i++;
            answer++;
        }

        System.out.println(answer);
    }
}
