class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int zero =0;
        int one = 1;
        int temp1 = zero;
        int temp2 = one;
        int m = n;
            
        for(int i=2; i<=m; i++){
            answer = (temp1 + temp2)%1234567;
            if(i%2==0){
                temp1 = answer;
            }else{
                temp2 = answer;
            }
        }
        

        
        return answer;
    }
}