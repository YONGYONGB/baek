import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        int count = 1;
        
        while(n>1){
            if(n%2==0){
                n = n/2;
            }else{
                count++;
                n = n-1;
                n = n/2;
            }
        }
    
        ans = count ;
        
        return ans;
    }
}