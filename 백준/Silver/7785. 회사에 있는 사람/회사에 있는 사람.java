import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        HashMap<String, String> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String state = input[1];
            map.put(name, state);
        }
        
        List<String> result = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).equals("enter")) {
                result.add(key);
            }
        }

        Collections.sort(result, Collections.reverseOrder()); // 사전 역순 정렬

        for (String name : result) {
            System.out.println(name);
        }
        
        
    }
    
}