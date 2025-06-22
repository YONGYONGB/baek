import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String args[])throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] result = new String[20];
        
        HashMap<String,Double> grade = new HashMap<>();
        double sum = 0.0;
        
        // 값넣기
        grade.put("A+",4.5);
        grade.put("A0",4.0);
        grade.put("B+",3.5);
        grade.put("B0",3.0);
        grade.put("C+",2.5);
        grade.put("C0",2.0);
        grade.put("D+",1.5);
        grade.put("D0",1.0);
        grade.put("F",0.0);
        
        int num = 0;
            
        for(int i=0;i<20;i++){
            result[i] = br.readLine();
            String[] r = result[i].split(" ");
                
            if(r[2].equals("P")){
                    continue;
            }else{
                sum += Double.parseDouble(r[1]) * grade.get(r[2]);
                num += Double.parseDouble(r[1]);
            }
            
        }
        
        System.out.printf("%.6f", sum/num);
        
    }
}