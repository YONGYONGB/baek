import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;       
       Map<String, Integer> numberMap = Map.of(
        "zero", 0, "one", 1, "two", 2, "three", 3, "four", 4,"five", 5, 
           "six", 6, "seven", 7, "eight", 8, "nine", 9
        );  
        for (String word : numberMap.keySet()) {
            s = s.replace(word, String.valueOf(numberMap.get(word)));
        }
        return Integer.parseInt(s);
    }
}