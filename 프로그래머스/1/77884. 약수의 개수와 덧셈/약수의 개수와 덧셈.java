class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            int count = 0;
            if(i%Math.sqrt(i)==0){
                 count++;
            }         
            if(count%2==0){
                answer += i;
            }else{
                answer -= i;
            }
        }
        
        return answer;
    }
}