
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> typeNum = new HashMap<>();
        
        for(String[] cloth : clothes){
            for(int i=0; i<cloth.length;i++){
                if(!typeNum.containsKey(cloth[cloth.length-1]) &&
                   i == cloth.length-1){     
                    typeNum.put(cloth[cloth.length-1],i);
                }else if(typeNum.containsKey(cloth[cloth.length-1]) &&
                   i == cloth.length-1){
                    int temp = typeNum.get(cloth[cloth.length-1]);
                    typeNum.put(cloth[cloth.length-1],i+temp);
                }
            }
        }
        
        for(String key: typeNum.keySet()) {
			Integer keyValue = typeNum.get(key);
            answer *= keyValue+1;
	    }
        
        
        return answer-1;
    }
}