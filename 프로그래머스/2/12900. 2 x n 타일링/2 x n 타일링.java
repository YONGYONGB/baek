class Solution {
    public int solution(int n) {
         
        int answer = 1;
        int ans = 0;

        for(int count = 1; count <= n; count++) {
            int temp = answer;
            answer = (answer + ans) % 1000000007;
            ans = temp;
        }
       
       
        return answer;
    }
}
