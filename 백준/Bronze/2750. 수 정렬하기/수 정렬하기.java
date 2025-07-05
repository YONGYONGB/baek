import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        List<Integer> s = new ArrayList<>();
        
        for(int i=0; i<N; i++){
            s.add(Integer.parseInt(br.readLine()));
        }
        
        List<Integer> result = s.stream().distinct().sorted().collect(Collectors.toList());
        
        for(int i=0; i<result.size(); i++){
           System.out.println(result.get(i));
        }
    }
    
}