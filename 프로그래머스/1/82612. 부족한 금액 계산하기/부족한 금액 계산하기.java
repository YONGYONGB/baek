class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long priceall = 0;
    
        for(int i=1; i<=count; i++){
            priceall += (long)(price * i);
        }
        
        if(priceall> money){
            answer = priceall - money;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}