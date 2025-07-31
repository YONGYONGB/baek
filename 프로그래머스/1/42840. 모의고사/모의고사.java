import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        
        int ans_one = check(answers,one,0);
        int ans_two = check(answers,two,0);
        int ans_three = check(answers,three,0);
        
        int max = (int)Math.max(ans_one, Math.max(ans_two,ans_three));
        if(max == ans_one) answer.add(1);
        if(max == ans_two) answer.add(2);
        if(max == ans_three) answer.add(3);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
    public int check(int[] answers, int[] hew, int index){
        if(index == answers.length){
            return 0;
        }
        int score = 0;
        if(answers[index]==hew[index%hew.length]){
            score = 1;
        }
        return score + check(answers,hew,index+1);
    }
}