import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args)throws IOException{
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] point = br.readLine().split(" ");
        int N = Integer.parseInt(point[0]);
        int M = Integer.parseInt(point[1]);
        
        
        int[] num = new int[N];
        
        String[] nums = br.readLine().split(" ");
        
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(nums[i]);
        }
            
        int max = 0;
        
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = num[i] + num[j] + num[k];
                    if (sum <= M) {
                        max = Math.max(max, sum);
                        if(max == M){
                            break;
                        }
                    }
                }
                if(max == M){
                            break;
                        }
            }
            if(max == M){
                            break;
                        }
        }
        
        System.out.print(max);
        
            
    }
    
}