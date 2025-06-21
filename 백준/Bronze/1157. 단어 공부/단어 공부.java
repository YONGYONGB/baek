import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String word = br.readLine().toUpperCase();
        HashMap<Character, Integer> w = new HashMap<>();
        
        for(int i=0; i< word.length(); i++){
            if(!w.containsKey(word.charAt(i))){
                w.put(word.charAt(i),1);
            }else{
                w.put(word.charAt(i),w.get(word.charAt(i))+1);
            }
        }
        
        char answer = ' ';
        int temp = 0;
        int count = 0;
        
        for(char key: w.keySet()){
            if(w.get(key)> temp){
                temp = w.get(key);
                answer = key;
                count =0;
            }else if(w.get(key) == temp){
                count ++;
            }else if(w.get(key) < temp){
                continue;
            }
        }
        
        if(count >=1){
            System.out.print("?");
        }else{
            System.out.print(answer);
        }
        
        
    }
    
}