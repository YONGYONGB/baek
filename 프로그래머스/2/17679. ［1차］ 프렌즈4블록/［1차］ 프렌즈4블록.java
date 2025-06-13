import java.util.*;
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] ch = new char[board.length][board[0].length()];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length(); j++){
                ch[i][j] = board[i].charAt(j);
            }
        }
        
        while (true) {
            if (!delete(ch)) break;  
            down(ch);
        }
        
        for(int i=0; i<ch.length; i++){
            for(int j=0; j< ch[0].length; j++){
                if(ch[i][j] == '0'){
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
   public boolean delete(char[][] ch) {
    boolean deleted = false;  
    boolean[][] mark = new boolean[ch.length][ch[0].length];
    
    for (int i = 1; i < ch.length; i++) {
        for (int j = 1; j < ch[0].length; j++) {
            char cur = ch[i][j];
            if (cur != '0' &&
                cur == ch[i - 1][j] &&
                cur == ch[i][j - 1] &&
                cur == ch[i - 1][j - 1]) {

                mark[i][j] = true;
                mark[i - 1][j] = true;
                mark[i][j - 1] = true;
                mark[i - 1][j - 1] = true;
                deleted = true;
            }
        }
    }
    for (int i = 0; i < ch.length; i++) {
        for (int j = 0; j < ch[0].length; j++) {
            if (mark[i][j]) {
                ch[i][j] = '0';
            }
        }
    }

    return deleted;
    }
    public void down(char[][] ch){
        for(int i=0; i<ch[0].length; i++){
            for(int j=ch.length-1; j>=0; j--){
                if(ch[j][i] == '0'){
                    for(int k=j-1; k>=0; k--){
                        if(ch[k][i] != '0'){
                            ch[j][i] = ch[k][i];
                            ch[k][i] = '0';
                            break;
                        }
                    }
                }
            }
        }
    }
    
    
    
}