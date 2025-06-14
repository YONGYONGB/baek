import java.util.*;
class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        int[] rate = new int[3];
        
        rate = rate(w,h,rate);
        
        if(rate[2] == -1){
            answer = (long)w*h - w;
        }else{
            answer = (long)w*h - (rate[0]+rate[1]-1)*rate[2]; 
        }
        return answer;
    }
    
    public int[] rate(int w, int h,int[] rate){
        if(w>h){
            int temp = 1;
            for(int i=1; i<=h; i++){
                if(h%i == 0 && w%i == 0){
                    temp = Math.max(temp, i);
                }else{
                    continue;
                }
            }
            rate[0] = w/temp;
            rate[1] = h/temp;
            rate[2] = temp;
            
            return rate;
        }else if(w<h){
            int temp = 1;
            for(int i=1; i<=w; i++){
                if(h%i == 0 && w%i == 0){
                    temp = Math.max(temp, i);
                }else{
                    continue;
                }
            }
            rate[0] = w/temp;
            rate[1] = h/temp;
            rate[2] = temp;   
            
            return rate;
        }else{
            for(int i=0; i<3; i++){
                rate[i] = -1;
            }
            return rate;
        }
    }
    
    
    
}