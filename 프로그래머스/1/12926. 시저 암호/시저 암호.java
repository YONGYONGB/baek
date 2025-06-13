class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int alp1 = 'A';
        int alp2 = 'a'; 
        
        for(int i=0; i< s.length(); i++){
               
            char alp = (char)(s.charAt(i) + n);
            
            if(s.charAt(i) == ' '){
                alp = ' ';
            }else if((char)s.charAt(i) + n  > 'Z' && 
                     (char)s.charAt(i) < 'a' ){
                alp = (char) ((alp -'Z') + alp1 - 1);
            }else if((char)s.charAt(i) + n  > 'z' ){
                alp = (char)((alp -'z') + alp2 - 1);
            }
            
            answer += alp;
        }
        return answer;
    }
}