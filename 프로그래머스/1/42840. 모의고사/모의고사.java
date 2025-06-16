import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        
        int num1 = ans(answers,a1);
        int num2 = ans(answers,a2);
        int num3 = ans(answers,a3);
        
        int max = Math.max(num1, Math.max(num2,num3));
        if(max == num1) answer.add(1);
        if(max == num2) answer.add(2);
        if(max == num3) answer.add(3);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
    public int ans(int[] answers, int[] a){
        int number =0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i%a.length]){
                number++;
            }
        }
        
        return number;
    }
    
}