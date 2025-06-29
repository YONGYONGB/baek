import java.io.*;

public class Main{
    
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());
        
        System.out.printf("%d", row*col);
        
    }
    
}