import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int game =0;
        int c = 0;
        
        while(c != n){
            c = (int)Math.pow(2,game);
            if(c == n){
                break;
            }
            game++;
        }
    
        
        int[] gamea = new int[game];
        int[] gameb = new int[game];
        
        gamea= count(game,a,gamea);
        gameb= count(game,b,gameb);
        
        for(int i=0; i<game; i++){
            int a1 =gamea[i];
            int b1 =gameb[i];
            if((a1+1 == b1 && a1/2+1 == b1/2 )||
               (a1-1 == b1 && a1/2 == b1/2+1)){
                break;
            }
            answer++;
        }

        return answer;
    }
    
    public int[] count(int game,int num, int[] round){
        
        for(int i=0; i<game; i++){
            round[i] = num;
            if(num == 1){
                num = 1;
            }else{
                if(num % 2 == 0){
                     num = num/2;
                }else{
                     num = num/2 + 1;
                }
            }
        }
        
        return round;
    }
}