import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, String> valid = new HashMap<>();
        
        // 주어진 유효기간
        for(String term: terms){
            String[] t = term.split(" ");
            valid.put(t[0],t[1]);
        } 
        
        // 개인정보
        for(int i=0; i<privacies.length; i++){
            String[] pri = privacies[i].split(" ");
            String date = changeDay(valid,pri);
            boolean lim = limit(today,date);
            if(lim){
                answer.add(i+1);
            }
              
        }
            
        return answer.stream().mapToInt(i->i).toArray();
    }
    public boolean limit(String today,String date){
        String[] p1 = today.split("\\.");
        String[] p2 = date.split("\\.");
       
        int y1 = Integer.parseInt(p1[0]);
        int m1 = Integer.parseInt(p1[1]);
        int d1 = Integer.parseInt(p1[2]);

        int y2 = Integer.parseInt(p2[0]);
        int m2 = Integer.parseInt(p2[1]);
        int d2 = Integer.parseInt(p2[2]);

        if(y1 > y2) return true;
        if(y1 == y2 && m1 > m2) return true;
        if(y1 == y2 && m1 == m2 && d1 > d2) return true;
        
        return false;

    }
    
    public String changeDay(HashMap<String, String> valid, String[] pri){
    String[] p = pri[0].split("\\.");

    int m = Integer.parseInt(valid.get(pri[1]));
    
    int day = Integer.parseInt(p[2]) - 1;
    if(day == 0) {
        day = 28;
        m -= 1;
    }

    int month = Integer.parseInt(p[1]) + m;
    int year = Integer.parseInt(p[0]);

    if(month > 12) {
        year += month / 12;
        month = month % 12;
        if(month == 0) { 
            month = 12;
            year -= 1;
        }
    }


    return year + "." + month + "." + day;
}

}