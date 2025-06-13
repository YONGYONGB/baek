import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
       
        int win_result = 7;
        int lose_result = 7;
        
        int zero = 0;        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zero ++;
            }
        }     
        for(int num : win_nums){
            if(Arrays.stream(lottos).anyMatch(n -> n == num)){
                win_result--;
            }else if(Arrays.stream(lottos).anyMatch(n -> n == 0) && zero >0 ){
                win_result--;
                zero--;
            }
        }                           
        for(int num : win_nums){
            if(Arrays.stream(lottos).anyMatch(n -> n == num)){
                lose_result--;
            }
        }
        if(win_result == 7){
            win_result = 6;
        }         
        if(lose_result == 7){
            lose_result = 6;
        }     
        win_result =  win_result;    
        int[] answer = {win_result, lose_result};
        return answer;
    }
}