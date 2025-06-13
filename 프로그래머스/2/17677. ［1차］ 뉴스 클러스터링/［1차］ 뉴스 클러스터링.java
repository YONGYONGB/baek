import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        double answer = 0;
        
        Map<String, Integer> s1 = change(str1);
        Map<String, Integer> s2 = change(str2);
        
        return (int)compare(s1,s2);
    }  
    
    public Map<String, Integer> change(String w) {
        Map<String, Integer> ch = new HashMap<>();
        String word = w.toUpperCase();

        for (int i = 0; i < word.length() - 1; i++) {
            String sub = word.substring(i, i + 2);
            if (sub.matches("[A-Z]{2}")) { 
                ch.put(sub, ch.getOrDefault(sub, 0) + 1);
            }
        }
        return ch;
    }
    
    public double compare(Map<String, Integer> a, Map<String, Integer> b) {
        double intersection = 0;
        double union = 0;

        Set<String> keys = new HashSet<>();
        keys.addAll(a.keySet());
        keys.addAll(b.keySet());

        for (String key : keys) {
            int countA = a.getOrDefault(key, 0);
            int countB = b.getOrDefault(key, 0);
            intersection += Math.min(countA, countB);
            union += Math.max(countA, countB);
        }

        if (union == 0) return 65536;
        return (intersection / union) * 65536;
    }
}