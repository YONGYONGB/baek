import java.util.*;
import java.io.*;

public class Main{
    
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] numbers = br.readLine().split(" ");
        
        int up= Integer.parseInt(numbers[0]);
        int down = Integer.parseInt(numbers[1]);
        int hight = Integer.parseInt(numbers[2]);
       
        
        int days = (hight - down) / (up - down);
        if ((hight - down) % (up - down) != 0) {
            days++;
        }
        
        System.out.print(days);
        
    }
    
    
    
}