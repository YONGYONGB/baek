import java.util.*;
import java.io.*;

public class Main{
    
    
    public static void main(String[] args) throws IOException{
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<Integer,Integer> row = new HashMap<>();
        HashMap<Integer,Integer> col = new HashMap<>();
        
        for(int i=0; i<3; i++){    
            String[] nums = br.readLine().split(" ");   
            int rnum = Integer.parseInt(nums[0]);
            int cnum = Integer.parseInt(nums[1]);
            row.put(rnum, row.getOrDefault(rnum, 0) + 1);
            col.put(cnum, col.getOrDefault(cnum, 0) + 1);
        }
        
       
       for(Integer key: row.keySet()) {
            if(row.get(key) == 1){
                System.out.printf("%d ", key);
                break;
            }
        }
        for(Integer key: col.keySet()) {
            if(col.get(key) == 1){
                System.out.printf("%d", key);
                break;
            }       
        }
        
    }
}