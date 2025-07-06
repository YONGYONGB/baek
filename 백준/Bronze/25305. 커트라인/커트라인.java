import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] stand = br.readLine().split(" ");
        int N = Integer.parseInt(stand[0]);
        int k = Integer.parseInt(stand[1]);
        
        List<Integer> list = new ArrayList<>();
        
        String[] num = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(num[i]));
        }
        
        Collections.sort(list);
        
        System.out.print(list.get(N-k));
        
        
    }
    
}
