import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        List<Integer> l = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            l.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(l);
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < l.size(); i++) {
            sb.append(l.get(i));
            if (i != l.size() - 1) sb.append('\n');
         }

        System.out.print(sb); 
       
        
        
    }
}