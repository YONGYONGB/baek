class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        int row = mul(sum,brown,yellow);
        int colum = sum/row;
        
        if(row >= colum){
            answer[0] = row;
            answer[1] = colum;
        }else{
            answer[0] = colum;
            answer[1] = row;
        }
        
        
        return answer;
    }
    public int mul(int sum,int brown, int yellow){
        int row =1;
        
        for(int i=2; i<= Math.sqrt(sum); i++){
            if(sum % i == 0 && (i-2)*(sum/i-2) ==yellow){
                row = i;
            }
        }
        
        return row;
    }
}