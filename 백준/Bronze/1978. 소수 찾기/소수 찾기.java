import java.util.*;
import java.io.*;

public class Main{
    
    
    public static void main(String[] args) throws IOException{
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int count = 0;
        
        for(int i=0; i<N; i++){
            boolean pass = true;
            int num = Integer.parseInt(nums[i]);
            if(num == 1){
                pass = false;
            }else{
                for(int j=1; j<=Math.sqrt(num); j++){
                    if(j > 1 && num % j ==0){
                        pass = false;
                        break;
                    }else{
                        continue;
                    }
                }
            }
            
            if(pass == true){
                count++;
            }
            
        }
        
        System.out.printf("%d", count);
        
    }
}