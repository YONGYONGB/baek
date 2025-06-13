class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp =0;
        for(int i=1; i<=n; i++){
            int m = (n-temp-i+1)/i;
            if(m <1){
              break;   
            }
            if(i*m + (i-1) + temp == n){
                answer++;
            }
            temp = i-1 + temp;
        }
        
            
        
        return answer;
    }
}